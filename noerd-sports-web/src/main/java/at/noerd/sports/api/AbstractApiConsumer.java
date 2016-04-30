package at.noerd.sports.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public abstract class AbstractApiConsumer<T> {
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	private static final String URL_DELIMITER = "/";

	@Autowired
	private RestTemplate restTemplate;

	@Value("${baseurl}")
	private String baseUrl;
	private String urlToConsume;

	private String urlSuffix;
	private final Class<T> fetchedClazz;

	protected AbstractApiConsumer(Class<T> fetchedClazz, String urlSuffix) {
		this.fetchedClazz = fetchedClazz;
		this.urlSuffix = urlSuffix;
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		urlToConsume = buildUrl();
	}

	public T consume() {
		try {
			LOGGER.debug("Consuming data from {}", urlToConsume);
			Object response = restTemplate.getForObject(urlToConsume, fetchedClazz);

			return fetchedClazz.cast(response);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public final Class<T> getFetchedClass() {
		return fetchedClazz;
	}

	private String buildUrl() {
		StringBuilder builder = new StringBuilder();

		// remove delimiter from baseurl
		if (baseUrl.endsWith(URL_DELIMITER)) {
			baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
		}

		builder.append(baseUrl);

		// add delimiter at first char
		if (!urlSuffix.startsWith(URL_DELIMITER)) {
			StringBuilder sb = new StringBuilder(URL_DELIMITER);
			sb.append(urlSuffix);
			urlSuffix = sb.toString();
		}

		if (urlSuffix.endsWith(URL_DELIMITER)) {
			urlSuffix = urlSuffix.substring(0, urlSuffix.length() - 1);
		}

		builder.append(urlSuffix);

		return builder.toString();
	}
}

package at.noerd.sports.external.consumer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import at.noerd.sports.api.SoccerService;
import at.noerd.sports.domain.League;
import at.noerd.sports.domain.Ranking;
import at.noerd.sports.domain.Team;

@Service
public class SoccerServiceImpl implements SoccerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SoccerServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	private String baseUrl;
	
	public SoccerServiceImpl() {
		baseUrl = env.getProperty("baseurl");
		LOGGER.debug("Instantiated SoccerServiceImpl with baseurl: " + baseUrl);
	}
	
	@Override
	public List<League> getAllLeagues() {
		List<League> allLeagues = new ArrayList<>();
		allLeagues.add(restTemplate.getForObject(baseUrl + "soccerseasons/394", League.class));
		return allLeagues;
	}

	@Override
	public List<Team> getAllTeamsForLeague(League league) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ranking getRankingForLeague(League league) {
		// TODO Auto-generated method stub
		return null;
	}

}

package at.noerd.sports.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import at.noerd.sports.domain.League;
import at.noerd.sports.domain.Team;
import at.noerd.sports.domain.dto.FixturesDTO;
import at.noerd.sports.domain.dto.RankingDTO;
import at.noerd.sports.domain.dto.TeamsDTO;

@Service
public class SoccerServiceImpl implements SoccerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SoccerServiceImpl.class);

	@Autowired
	private Environment env;
	@Autowired
	private RestTemplate restTemplate;

	private String baseUrl;

	public SoccerServiceImpl() {
		LOGGER.debug("Instantiated SoccerServiceImpl");
	}

	@Override
	public List<League> getAllLeagues() {
		List<League> allLeagues = new ArrayList<>();

		baseUrl = env.getProperty("baseurl") + env.getProperty("seasons");
		LOGGER.debug(baseUrl);
		ResponseEntity<League[]> leagues = restTemplate.getForEntity(baseUrl, League[].class);
		allLeagues = Arrays.asList(leagues.getBody());

		LOGGER.debug("Retrieving all leagues: " + allLeagues.toString());
		return allLeagues;
	}

	@Override
	public League getLeague(int id) {
		baseUrl = env.getProperty("baseurl") + env.getProperty("seasons") + id;
		LOGGER.debug(baseUrl);
		return restTemplate.getForObject(baseUrl, League.class);
	}

	@Override
	public List<Team> getAllTeamsForLeague(League league) {
		baseUrl = getUrl(String.valueOf(league.getId()));
		LOGGER.debug(baseUrl);
		TeamsDTO teams = restTemplate.getForObject(baseUrl, TeamsDTO.class);
		return teams.getTeams();
	}

	@Override
	public RankingDTO getRankingForLeague(League league) {
		baseUrl = getUrlForRanking(String.valueOf(league.getId()));
		LOGGER.debug(baseUrl);
		return restTemplate.getForObject(baseUrl, RankingDTO.class);
	}

	@Override
	public RankingDTO getRankingForLeagueAndMatchday(League league, int matchday) {
		baseUrl = getUrlForRanking(String.valueOf(league.getId())) + "?matchday=" + matchday;
		LOGGER.debug(baseUrl);
		return restTemplate.getForObject(baseUrl, RankingDTO.class);
	}
	
	@Override
	public FixturesDTO getFixturesForLeague(League league) {
		baseUrl = getUrlForFixtures(String.valueOf(league.getId()));
		LOGGER.debug(baseUrl);
		return restTemplate.getForObject(baseUrl, FixturesDTO.class);
	}
	
	@Override
	public FixturesDTO getFixturesForLeagueAndMatchday(League league, int matchday) {
		baseUrl = getUrlForFixtures(String.valueOf(league.getId())) + "?matchday=" + matchday;
		LOGGER.debug(baseUrl);
		return restTemplate.getForObject(baseUrl, FixturesDTO.class);
	}
	
	private String getUrl(String inBetweenValue) {
		StringBuilder builder = new StringBuilder();

		return builder.append(env.getProperty("baseurl")).append(env.getProperty("seasons")).append("/")
				.append(inBetweenValue).append(env.getProperty("teams")).toString();
	}
	
	private String getUrlForRanking(String inBetweenValue) {
		StringBuilder builder = new StringBuilder();

		return builder.append(env.getProperty("baseurl")).append(env.getProperty("seasons")).append("/")
				.append(inBetweenValue).append(env.getProperty("ranking")).toString();
	
	}

	private String getUrlForFixtures(String inBetweenValue) {
		StringBuilder builder = new StringBuilder();

		return builder.append(env.getProperty("baseurl")).append(env.getProperty("seasons")).append("/")
				.append(inBetweenValue).append(env.getProperty("fixtures")).toString();
	
	}
}

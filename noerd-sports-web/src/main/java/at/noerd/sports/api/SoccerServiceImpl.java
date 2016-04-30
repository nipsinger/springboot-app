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
import at.noerd.sports.domain.Ranking;
import at.noerd.sports.domain.Team;

@Service
public class SoccerServiceImpl implements SoccerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SoccerServiceImpl.class);
	
	@Autowired
	private Environment env;
	
	private String baseUrl;
	
	public SoccerServiceImpl() {
		LOGGER.debug("Instantiated SoccerServiceImpl");
	}
	
	@Override
	public List<League> getAllLeagues() {
		RestTemplate restTemplate = new RestTemplate();
		List<League> allLeagues = new ArrayList<>();
		
		baseUrl = env.getProperty("baseurl") + env.getProperty("seasons");
		
		LOGGER.debug("Parsing URL: " + baseUrl);
		// 394 dt. liga
		ResponseEntity<League[]> leagues = restTemplate.getForEntity(baseUrl, League[].class);
		allLeagues = Arrays.asList(leagues.getBody());
		
		LOGGER.debug(allLeagues.toString());
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

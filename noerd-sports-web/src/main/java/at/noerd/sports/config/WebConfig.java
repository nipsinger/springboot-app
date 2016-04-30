package at.noerd.sports.config;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

import at.noerd.sports.api.SoccerService;
import at.noerd.sports.domain.League;
import at.noerd.sports.interceptors.ApiKeyInterceptor;

@SpringBootApplication
@ComponentScan(basePackages = "at.noerd.sports")
@PropertySource(value = "classpath:config/soccerapi.properties")
public class WebConfig implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebConfig.class);
	
	@Autowired
	private SoccerService soccerService;

	@Override
	public void run(String... args) throws Exception {

		League league = soccerService.getLeague(395);
		LOGGER.debug(league.toString());
		
//		List<League> allLeagues = soccerService.getAllLeagues();
//		LOGGER.debug(allLeagues.toString());
//
//		League league = soccerService.getLeague(395);
//		LOGGER.debug(league.toString());
//
//		List<Team> teams = soccerService.getAllTeamsForLeague(league);
//		LOGGER.debug(teams.toString());
//		
//		RankingDTO ranking = soccerService.getRankingForLeague(league);
//		LOGGER.debug(ranking.getStanding().toString());
//		
//		RankingDTO matchdayRanking = soccerService.getRankingForLeagueAndMatchday(league, 20);
//		LOGGER.debug(matchdayRanking.getStanding().toString());
//		
//		FixturesDTO fixtures = soccerService.getFixturesForLeague(league);
//		LOGGER.debug(fixtures.getFixtures().toString());
//		
//		FixturesDTO matchdayFixtures = soccerService.getFixturesForLeagueAndMatchday(league, 34);
//		LOGGER.debug(matchdayFixtures.getFixtures().toString());
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate =  new RestTemplate();
		restTemplate.setInterceptors(Collections.singletonList(new ApiKeyInterceptor()));
		return restTemplate;
	}
	
}
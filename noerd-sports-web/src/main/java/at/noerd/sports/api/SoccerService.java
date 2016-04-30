package at.noerd.sports.api;

import java.util.List;

import at.noerd.sports.domain.League;
import at.noerd.sports.domain.Ranking;
import at.noerd.sports.domain.Team;

public interface SoccerService {
	
	List<League> getAllLeagues();
	List<Team> getAllTeamsForLeague(League league);
	Ranking getRankingForLeague(League league);

}

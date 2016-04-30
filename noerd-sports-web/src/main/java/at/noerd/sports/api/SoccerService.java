package at.noerd.sports.api;

import java.util.List;

import at.noerd.sports.domain.League;
import at.noerd.sports.domain.Team;
import at.noerd.sports.domain.dto.RankingDTO;

public interface SoccerService {
	
	List<League> getAllLeagues();
	League getLeague(int id);
	List<Team> getAllTeamsForLeague(League league);
	RankingDTO getRankingForLeague(League league);
	RankingDTO getRankingForLeagueAndMatchday(League league, int matchday);

}

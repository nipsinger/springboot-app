package at.noerd.sports.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rank {
	private int rank;
	private Team team;
	private int playedGames;
	private int points;
	private int goalsFor;
	private int goalsAgainst;
	private int goalDifference;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public int getPlayedGames() {
		return playedGames;
	}
	public void setPlayedGames(int playedGames) {
		this.playedGames = playedGames;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getGoalsFor() {
		return goalsFor;
	}
	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}
	public int getGoalDifference() {
		return goalDifference;
	}
	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
	}
	
	
}

package at.noerd.sports.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rank {
	@JsonProperty(value = "position")
	private int rank;
	@JsonProperty(value = "teamName")
	private String team;
	private int playedGames;
	private int points;
	@JsonProperty(value = "goals")
	private int goalsFor;
	private int goalsAgainst;
	private int goalDifference;
	private int wins;
	private int draws;
	private int losses;
	private RankStatistic home;
	private RankStatistic away;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
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
	
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	public RankStatistic getHome() {
		return home;
	}
	public void setHome(RankStatistic home) {
		this.home = home;
	}
	public RankStatistic getAway() {
		return away;
	}
	public void setAway(RankStatistic away) {
		this.away = away;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)  
	      {  
	         return false;  
	      }  
	      if (getClass() != obj.getClass())  
	      {  
	         return false;  
	      }
	      
	      final Rank other = (Rank) obj;
	      
	      return Objects.equal(this.rank, other.rank)
	          && Objects.equal(this.team, other.team)
	          && Objects.equal(this.playedGames, other.playedGames)
	          && Objects.equal(this.points, other.points)
	          && Objects.equal(this.goalsFor, other.goalsFor)
	          && Objects.equal(this.goalsAgainst, other.goalsAgainst)
	          && Objects.equal(this.goalDifference, other.goalDifference)
	          && Objects.equal(this.wins, other.wins)
	          && Objects.equal(this.draws, other.draws)
	          && Objects.equal(this.losses, other.losses)
	          && Objects.equal(this.home, other.home)
	          && Objects.equal(this.away, other.away);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("rank", rank)
				.add("team", team)
				.add("playedGames", playedGames)
				.add("points", points)
				.add("goalsFor", goalsFor)
				.add("goalsAgainst", goalsAgainst)
				.add("goalDifference", goalDifference)
				.add("wins", wins)
				.add("draws", draws)
				.add("losses", losses)
				.add("home", home)
				.add("away", away).toString();
	}
}

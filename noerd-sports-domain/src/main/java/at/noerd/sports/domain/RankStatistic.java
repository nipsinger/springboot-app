package at.noerd.sports.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RankStatistic {
	@JsonProperty(value = "goals")
	private int goalsFor;
	private int goalsAgainst;
	private int wins;
	private int draws;
	private int losses;
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
	      
	      final RankStatistic other = (RankStatistic) obj;
	      
	      return Objects.equal(this.goalsFor, other.goalsFor)
	          && Objects.equal(this.goalsAgainst, other.goalsAgainst)
	          && Objects.equal(this.wins, other.wins)
	          && Objects.equal(this.draws, other.draws)
	          && Objects.equal(this.losses, other.losses);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("goalsFor", goalsFor)
				.add("goalsAgainst", goalsAgainst)
				.add("wins", wins)
				.add("draws", draws)
				.add("losses", losses).toString();
	}
}

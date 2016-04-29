package at.noerd.sports.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ranking {
	private League league;
	private int currentMatchday;
	private List<Rank> standing;
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	public int getCurrentMatchday() {
		return currentMatchday;
	}
	public void setCurrentMatchday(int currentMatchday) {
		this.currentMatchday = currentMatchday;
	}
	public List<Rank> getStanding() {
		return standing;
	}
	public void setStanding(List<Rank> standing) {
		this.standing = standing;
	}
	
	
}

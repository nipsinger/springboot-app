package at.noerd.sports.domain.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import at.noerd.sports.domain.Rank;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RankingDTO {
	private String leagueCaption;
	private int matchday;
	private List<Rank> standing;
	public String getLeagueCaption() {
		return leagueCaption;
	}
	public void setLeagueCaption(String leagueCaption) {
		this.leagueCaption = leagueCaption;
	}
	public int getMatchday() {
		return matchday;
	}
	public void setMatchday(int matchday) {
		this.matchday = matchday;
	}
	public List<Rank> getStanding() {
		return standing;
	}
	public void setStanding(List<Rank> rank) {
		this.standing = rank;
	}
}

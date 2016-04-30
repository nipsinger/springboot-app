package at.noerd.sports.domain.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import at.noerd.sports.domain.Team;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamsDTO {
	private int count;
	private List<Team> teams;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
	
}

package at.noerd.sports.domain.dto;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import at.noerd.sports.domain.League;

@JsonAutoDetect
public class LeaguesDTO {
	private Collection<League> leagues;

	public Collection<League> getLeagues() {
		return leagues;
	}

	public void setLeagues(Collection<League> leagues) {
		this.leagues = leagues;
	}
}

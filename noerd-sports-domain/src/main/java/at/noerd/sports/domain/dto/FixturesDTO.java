package at.noerd.sports.domain.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import at.noerd.sports.domain.Fixture;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FixturesDTO {
	private int count;
	private List<Fixture> fixtures;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Fixture> getFixtures() {
		return fixtures;
	}
	public void setFixtures(List<Fixture> fixtures) {
		this.fixtures = fixtures;
	}
}

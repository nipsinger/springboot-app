package at.noerd.sports.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
	private int id;
	private String name;
	private String code;
	private String shortName;
	private String squadMarketValue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getSquadMarketValue() {
		return squadMarketValue;
	}
	public void setSquadMarketValue(String squadMarketValue) {
		this.squadMarketValue = squadMarketValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		final Team other = (Team) obj;
		
		return Objects.equal(this.id, other.id)
			&& Objects.equal(this.name, other.name)
			&& Objects.equal(this.code, other.code)
			&& Objects.equal(this.shortName, other.shortName)
			&& Objects.equal(this.squadMarketValue, other.squadMarketValue);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("name", name)
				.add("code", code)
				.add("shortName", shortName)
				.add("squadMarketValue", squadMarketValue).toString();
	}
	
}

package at.noerd.springboot.bom;

import java.math.BigDecimal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Team {
	private String name;
	private String code;
	private String shortName;
	private BigDecimal squadMarketValue;
	
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
	public BigDecimal getSquadMarketValue() {
		return squadMarketValue;
	}
	public void setSquadMarketValue(BigDecimal squadMarketValue) {
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
		
		return Objects.equal(this.name, other.name)
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

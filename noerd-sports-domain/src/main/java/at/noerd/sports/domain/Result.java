package at.noerd.sports.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	private String goalsHomeTeam = "";
	
	private String goalsAwayTeam = "";
	public String getGoalsHomeTeam() {
		return goalsHomeTeam;
	}
	public void setGoalsHomeTeam(String goalsHomeTeam) {
		this.goalsHomeTeam = goalsHomeTeam;
	}
	public String getGoalsAwayTeam() {
		return goalsAwayTeam;
	}
	public void setGoalsAwayTeam(String goalsAwayTeam) {
		this.goalsAwayTeam = goalsAwayTeam;
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
	      
	      final Result other = (Result) obj;
	      
	      return Objects.equal(this.goalsHomeTeam, other.goalsHomeTeam)
	          && Objects.equal(this.goalsAwayTeam, other.goalsAwayTeam);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("goalsHomeTeam", goalsHomeTeam)
				.add("goalsAwayTeam", goalsAwayTeam).toString();
	}
	
}

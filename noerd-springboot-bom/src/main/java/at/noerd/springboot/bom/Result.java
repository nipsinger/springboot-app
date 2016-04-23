package at.noerd.springboot.bom;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Result {
	private int goalsHomeTeam;
	
	private int goalsAwayTeam;
	public int getGoalsHomeTeam() {
		return goalsHomeTeam;
	}
	public void setGoalsHomeTeam(int goalsHomeTeam) {
		this.goalsHomeTeam = goalsHomeTeam;
	}
	public int getGoalsAwayTeam() {
		return goalsAwayTeam;
	}
	public void setGoalsAwayTeam(int goalsAwayTeam) {
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

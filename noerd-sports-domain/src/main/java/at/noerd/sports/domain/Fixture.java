package at.noerd.sports.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document
public class Fixture {

	@Id
	private String id;
	private DateTime date;
	private Status status;
	private int matchday;
	private String homeTeamName;
	private String awayTeamName;
	private Result result;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getMatchday() {
		return matchday;
	}
	public void setMatchday(int matchday) {
		this.matchday = matchday;
	}
	public String getHomeTeamName() {
		return homeTeamName;
	}
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}
	public String getAwayTeamName() {
		return awayTeamName;
	}
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
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
	      
	      final Fixture other = (Fixture) obj;
	      
	      return Objects.equal(this.id, other.id)
	    	  && Objects.equal(this.date, other.date)
	          && Objects.equal(this.status, other.status)
	          && Objects.equal(this.matchday, other.matchday)
	          && Objects.equal(this.homeTeamName, other.homeTeamName)
	          && Objects.equal(this.awayTeamName, other.awayTeamName)
	          && Objects.equal(this.result, other.result);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("id", id)
				.add("date", date)
				.add("status", status)
				.add("matchday", matchday)
				.add("homeTeamName", homeTeamName)
				.add("awayTeamName", awayTeamName)
				.add("result", result).toString();
	}
}

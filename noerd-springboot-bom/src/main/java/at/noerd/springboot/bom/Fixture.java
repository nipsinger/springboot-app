package at.noerd.springboot.bom;

import java.util.List;

import javax.xml.transform.Result;

import org.joda.time.DateTime;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Fixture {

	private List<Link> _links;
	private DateTime date;
	private Status status;
	private int matchday;
	private Team homeTeam;
	private Team awayTeam;
	private Result result;
	public List<Link> get_links() {
		return _links;
	}
	public void set_links(List<Link> _links) {
		this._links = _links;
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
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
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
	      
	      return Objects.equal(this._links, other._links)
	          && Objects.equal(this.date, other.date)
	          && Objects.equal(this.status, other.status)
	          && Objects.equal(this.matchday, other.matchday)
	          && Objects.equal(this.homeTeam, other.homeTeam)
	          && Objects.equal(this.awayTeam, other.awayTeam)
	          && Objects.equal(this.result, other.result);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("_links", _links)
				.add("date", date)
				.add("status", status)
				.add("matchday", matchday)
				.add("homeTeam", homeTeam)
				.add("awayTeam", awayTeam)
				.add("result", result).toString();
	}
}

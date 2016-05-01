package at.noerd.sports.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document
public class League {

	@Id
	private String id;
	private String caption;
	private int year;
	private int numberOfTeams;
	private int numberOfGames;
	private DateTime lastUpdated;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCaption() {
		return caption;
	}
	
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getNumberOfTeams() {
		return numberOfTeams;
	}
	
	public void setNumberOfTeams(int numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}
	
	public int getNumberOfGames() {
		return numberOfGames;
	}
	
	public void setNumberOfGames(int numberOfGames) {
		this.numberOfGames = numberOfGames;
	}
	
	public DateTime getLastUpdated() {
		return lastUpdated;
	}
	
	public void setLastUpdated(DateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
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
	      
	      final League other = (League) obj;
	      
	      return Objects.equal(this.id, other.id)
	          && Objects.equal(this.caption, other.caption)
	          && Objects.equal(this.year, other.year)
	          && Objects.equal(this.numberOfTeams, other.numberOfTeams)
	          && Objects.equal(this.numberOfGames, other.numberOfGames)
	          && Objects.equal(this.lastUpdated, other.lastUpdated);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("id", id)
				.add("caption", caption)
				.add("year", year)
				.add("numberOfTeams", numberOfTeams)
				.add("numberOfGames", numberOfGames)
				.add("lastUpdated", lastUpdated).toString();
	}
}

package at.noerd.sports.api;

import org.springframework.stereotype.Service;

import at.noerd.sports.domain.League;

@Service
final class LeagueApiConsumer extends AbstractApiConsumer<League> {
	public LeagueApiConsumer() {
		super(League.class, "soccerseasons/395");
	}
}	

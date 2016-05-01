package at.noerd.sports.api;

import org.springframework.stereotype.Service;

import at.noerd.sports.domain.dto.LeaguesDTO;

@Service
final class LeagueApiConsumer extends AbstractApiConsumer<LeaguesDTO> {
	public LeagueApiConsumer() {
		super(LeaguesDTO.class, "soccerseasons");
	}
}	

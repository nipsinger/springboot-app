package at.noerd.sports.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import at.noerd.sports.domain.League;

public interface LeagueRepository extends MongoRepository<League, String> {
}

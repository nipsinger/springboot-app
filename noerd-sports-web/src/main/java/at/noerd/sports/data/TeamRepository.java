package at.noerd.sports.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import at.noerd.sports.domain.Team;

public interface TeamRepository extends MongoRepository<Team, String> {
}

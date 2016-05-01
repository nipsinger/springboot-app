package at.noerd.sports.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import at.noerd.sports.domain.Fixture;

public interface FixtureRepository extends MongoRepository<Fixture, String> {
}

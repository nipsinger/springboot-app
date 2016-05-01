package at.noerd.sports.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import at.noerd.sports.domain.Rank;

public interface RankingRepository extends MongoRepository<Rank, String> {
}

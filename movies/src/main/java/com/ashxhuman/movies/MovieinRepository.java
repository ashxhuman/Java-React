package com.ashxhuman.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieinRepository extends MongoRepository<Movie, ObjectId>{

    Optional<Movie> findMovieByImdbId(String imdbId);
}

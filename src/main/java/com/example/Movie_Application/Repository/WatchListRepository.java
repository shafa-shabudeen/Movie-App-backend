package com.example.Movie_Application;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WatchListRepository extends MongoRepository<WatchList, ObjectId> {
    List<WatchList> findWatchListByClerkId(String clerkId);
}

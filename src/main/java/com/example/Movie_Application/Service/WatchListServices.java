package com.example.Movie_Application;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class WatchListServices {

    @Autowired
    private WatchListRepository watchListRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public WatchList createWatchList(String movieName,String imdbId, String userEmail, String clerkId){
        WatchList watchList = watchListRepository.insert(new WatchList(movieName,userEmail,clerkId));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("watchListIds").value(watchList))
                .first();

        return watchList;
    }

    public List<WatchList> getWatchListByClerkId(String clerkId){
          return watchListRepository.findWatchListByClerkId(clerkId).stream().toList();
    }

}

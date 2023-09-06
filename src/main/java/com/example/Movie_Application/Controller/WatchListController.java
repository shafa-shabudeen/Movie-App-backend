package com.example.Movie_Application;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/watchLists")
@CrossOrigin("http://localhost:3000")
public class WatchListController {

    @Autowired
    private WatchListServices watchListServices;

    @PostMapping
    public ResponseEntity<WatchList> createWatchList(@RequestBody Map<String,String> payload){

        String movieName = payload.get("movieName");
        String imdbId = payload.get("imdbId");
        String userEmail = payload.get("userEmail");
        String clerkId = payload.get("clerkId");

        WatchList createdWatchListItem = watchListServices.createWatchList(movieName,imdbId,userEmail,clerkId);

        return new ResponseEntity<WatchList>(createdWatchListItem, HttpStatus.CREATED);
    }

    @GetMapping("/{clerkId}")
    public ResponseEntity<List<WatchList>> getWatchListByClerkId(@PathVariable String clerkId){
        return  new ResponseEntity<List<WatchList>>(watchListServices.getWatchListByClerkId(clerkId),HttpStatus.OK);
    }



}

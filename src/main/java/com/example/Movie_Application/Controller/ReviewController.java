package com.example.Movie_Application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {
    @Autowired
    private ReviewServices reviewServices;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload){

        String imdbId = payload.get("imdbId");
        String body = payload.get("body");

        Review createdReviewItem = reviewServices.createReview(imdbId,body);

        return new ResponseEntity<Review>(createdReviewItem, HttpStatus.CREATED);
    }
}

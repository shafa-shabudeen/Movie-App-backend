package com.example.Movie_Application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "watchlist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WatchList {
    @Id
    private ObjectId id;
    private String movieName;
    private String userEmail;
    private String clerkId;

    public WatchList(String movieName, String userEmail, String clerkId) {
        this.movieName = movieName;
        this.userEmail = userEmail;
        this.clerkId = clerkId;
    }

}

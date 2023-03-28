package com.example.Movie_Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }


    /*public Optional<Movie> singleMovieById(ObjectId id){
        return movieRepository.findById(id);
    }*/

    public Optional<Movie> singleMovieByImdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

}

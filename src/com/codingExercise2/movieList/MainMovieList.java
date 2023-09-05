package com.codingExercise2.movieList;

import java.util.Arrays;

public class MainMovieList {
    public static void main(String[] args) {
        MovieList movie = new MovieList("Snatch", "Guy Ritchie", Arrays.asList("Jason Statham", "Brad Pitt"));

        movie.addReview("Great movie!");
        movie.addReview("The acting was really good, especially Brad Pitt.");
        movie.addReview("Ya like dags?");

        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + movie.getActors());
        System.out.println("Reviews: " + movie.getReviews());
    }
}
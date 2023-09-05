package com.codingExercise2.movieList;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public MovieList(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public List<String> getReviews() {
        return reviews;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }
}

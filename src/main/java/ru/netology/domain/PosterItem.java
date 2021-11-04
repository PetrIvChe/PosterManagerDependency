package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor


public class PosterItem {
    public int length;
    private int id;
    private int movieId;
    private String movieName;
    private int count;

    public PosterItem(int i, int i1, String bladshot) {
    }


    public int getId() {
        return id;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setCount(int count) {
        this.count = count;
    }


}

package ru.netology.project;

public class MovieManager {

    private String[] movie = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public void addMovie(String movies) {
        String[] tmp = new String[movie.length + 1];
        for (int i = 0; i < movie.length; i++) {
            tmp[i] = movie[i];
        }
        tmp[tmp.length - 1] = movies;
        movie = tmp;
    }

    public String[] findAll() {
        return movie;
    }

    public String[] findLast() {

        int resultlength;
        if (movie.length < limit) {
            resultlength = movie.length;
        } else {
            resultlength = limit;
        }

        String[] result = new String[resultlength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movie[movie.length - 1 - i];
        }
        return result;
    }
}
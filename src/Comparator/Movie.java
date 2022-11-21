package Comparator;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {
    private String name;
    private double rating;
    private int year;
    public int compare(Movie left, Movie right) {
        return Integer.compare(left.year, right.year);
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Movie(double rating, int year) {
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

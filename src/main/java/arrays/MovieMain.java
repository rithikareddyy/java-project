package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(2020, 8.0, 5000000.0, 8000000.0));
        movies.add(new Movie(2021, 8.5, 7500000.0, 1200000.0));
        movies.add(new Movie(2022, 9.0, 6000000.0, 2000000.0));
        movies.add(new Movie(2023, 8.2, 8000000.0, 1100000.0));

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return Double.compare(movie2.getRating(), movie1.getRating());
            }
        });

        System.out.println("Movies sorted by rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                double profit1 = movie1.getCollectionAmount() - movie1.getBudget();
                double profit2 = movie2.getCollectionAmount() - movie2.getBudget();
                return Double.compare(profit2, profit1);
            }
        });

        System.out.println("\nMovies sorted by profit:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
package arrays;

import java.util.Comparator;
class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    @Override
    public String toString() {
        return "Movie [yearReleased=" + yearReleased + ", rating=" + rating +
                ", budget=" + budget + ", collectionAmount=" + collectionAmount + "]";
    }
}


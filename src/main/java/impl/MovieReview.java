package impl;

import abstract_classes.Review;

public class MovieReview extends Review {

    MovieReview(String name){
        super(name);
    }

    @Override
    public void rating(Integer rating) {
        System.out.println("Rating: " + rating);
    }

    @Override
    public void reviewerName(String name) {
        System.out.println("Reviewer's Name : " + name);
    }

    public String movieDuration(String duration){
        return "Movie Duration: " + duration;
    }
}

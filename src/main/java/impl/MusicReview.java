package impl;

import interfaces.Review;

public class MusicReview implements Review {

    private String name;

    MusicReview(String name){
        this.name = name;
    }

    @Override
    public void rating(Integer rating) {
        System.out.println("Rating: " + rating);
    }

    @Override
    public void reviewerName(String name) {
        System.out.println("Reviewer's Name : " + name);
    }

    public String genre(String genre){
        return genre;
    }

}

package impl;

import abstract_classes.Review;

public class GameReview extends Review {

    GameReview(String name){
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

    public String completionTime(String time){
        return "Time taken to complete the game: " + time;
    }
}

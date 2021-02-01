package com.learning.movieratings.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {

    private List<Rating> ratings;

   

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void initData(String userId) {
       // this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating("100", 3),
                new Rating("200", 4)
        ));
    }
}

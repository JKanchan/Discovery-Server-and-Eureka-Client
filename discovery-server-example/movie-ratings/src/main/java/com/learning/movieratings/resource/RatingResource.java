package com.learning.movieratings.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.movieratings.model.Rating;
import com.learning.movieratings.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	 @RequestMapping("/user/{userId}") 
	 public UserRating getUserRatings(@PathVariable("userId") String userId) 
	 {
		 List<Rating> ratings = Arrays.asList(
					new Rating("1",5),
					new Rating("2",5)
					);
		 UserRating userRating  = new UserRating(); 
		 userRating.setRatings(ratings);
		 return userRating;
	 
	 }
	

}

package com.sidrsp.ratingsdataservice.resources;

import com.sidrsp.ratingsdataservice.resources.models.Rating;
import com.sidrsp.ratingsdataservice.resources.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsService {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable String userId){
        UserRating userRating = new UserRating();

        List<Rating> ratings = Arrays.asList(
                new Rating("1", 3),
                new Rating("2", 3)
        );

        userRating.setUserRating(ratings);
        return userRating;
    }
}

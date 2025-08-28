package com.example.RatingService.services;

import com.example.RatingService.entitities.RatingEntity;
import com.example.RatingService.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RatingService {

    //creating a dependency
    //get all ratings
    //create rating
    //get rating by a id
    // get ratings by user id
    // get ratings by a hotel id
    @Autowired
    private RatingRepository ratingRepository;

    //for getting all ratings
    public List<RatingEntity> getAllRatings() {

        return ratingRepository.findAll();

    }

    //for creating a rating

    public RatingEntity createRating(RatingEntity rating)
    {
        return ratingRepository.save(rating);
    }

    //for getting rating by one id

//    public RatingEntity getRatingById(String iD)
//    {
//        return ratingRepository.findBy(iD);
//    }

    //get rating by user id

    public List<RatingEntity> getRatingByUserId(String userId)
    {
        return ratingRepository.findByUserId(userId);
    }

    //get rating by hotel id

    public List<RatingEntity> getRatingByHotelId(String hotelId)
    {
        return ratingRepository.findByHotelId(hotelId);
    }



}

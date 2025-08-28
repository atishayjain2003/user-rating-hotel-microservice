package com.example.RatingService.controllers;

import com.example.RatingService.entitities.RatingEntity;
import com.example.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    //create rating
    @Autowired
    private RatingService ratingService;

    @PostMapping("/createRating")
    public ResponseEntity<RatingEntity> createRating(@RequestBody RatingEntity rating) {
        RatingEntity createdRating = ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRating);
    }

    @GetMapping("/all-Ratings")
    //to find all
    public ResponseEntity<List<RatingEntity>> getAllRatings() {
        List<RatingEntity> allRatings = ratingService.getAllRatings();
        return ResponseEntity.status(HttpStatus.OK).body(allRatings);
    }

    //to find rating by user id
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<RatingEntity>> getRatingByUserId(@PathVariable String userId) {
        List<RatingEntity> ratingByUserId = ratingService.getRatingByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(ratingByUserId);
    }

    //to find rating by hotel id
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<RatingEntity>> getRatingByHotelId(@PathVariable String hotelId) {
        List<RatingEntity> ratingByHotelId = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(ratingByHotelId);
    }
}
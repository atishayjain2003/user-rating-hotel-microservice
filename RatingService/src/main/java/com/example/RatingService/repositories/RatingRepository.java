package com.example.RatingService.repositories;

import com.example.RatingService.entitities.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<RatingEntity, String> {
    //custom methods to find rating by user id and hotel id instead of rating id

    // find by rating id is default method

    List<RatingEntity> findByUserId(String userId);
    List<RatingEntity> findByHotelId(String hotelId);
}

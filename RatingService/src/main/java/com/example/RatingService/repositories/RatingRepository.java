package com.example.RatingService.repositories;

import com.example.RatingService.entitities.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<RatingEntity, String> {
}

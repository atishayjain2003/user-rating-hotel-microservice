package com.example.HotelService.repositories;

import com.example.HotelService.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, String> {

}

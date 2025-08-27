package com.example.HotelService.controllers;

import com.example.HotelService.entities.HotelEntity;
import com.example.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hotels")
public class HotelController {
    //to get all hotels

    @Autowired
    private HotelService hotelService;

    @GetMapping("/all-Hotels")
    public ResponseEntity<List<HotelEntity>> getAllHotels()
    {
        List<HotelEntity> allHotels=hotelService.getAllHotels();
        return ResponseEntity.status(HttpStatus.OK).body(allHotels);
    }

    //to create hotel

    @PostMapping("/createHotel")
    private ResponseEntity<HotelEntity> createHotel(@RequestBody HotelEntity hotel)
    {
        HotelEntity createdHotel=hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
    }

    //to find hotel by a given id

    @GetMapping("/{hotelId}")
    private HotelEntity getHotelById(@PathVariable String hotelId)
    {
        HotelEntity foundHotel=hotelService.getHotelById(hotelId);
        return foundHotel;
    }
}

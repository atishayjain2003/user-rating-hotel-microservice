package com.example.HotelService.services;


import com.example.HotelService.entities.HotelEntity;
import com.example.HotelService.repositories.HotelRepository;
import com.example.UserService.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    //to find all hotels
    public List<HotelEntity> getAllHotels()
    {
        return hotelRepository.findAll();
    }

    //to create a hotel model

    public HotelEntity createHotel(HotelEntity hotel)
    {
        return hotelRepository.save(hotel);
    }

    //to get a single hotel using hotel id

    public HotelEntity getHotelById(String hotelId)
    {
        return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("User with given id not present in database"));
    }


}

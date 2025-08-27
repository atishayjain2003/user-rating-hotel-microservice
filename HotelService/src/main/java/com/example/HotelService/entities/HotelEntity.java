package com.example.HotelService.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hotels")
public class HotelEntity {

    //defining what table structure we want to store in database
    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;

}

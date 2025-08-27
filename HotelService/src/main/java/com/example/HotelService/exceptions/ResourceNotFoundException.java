package com.example.HotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException (String S)
    {
        super(S);
    }
    public ResourceNotFoundException()
    {
        super("Resource Not Found");
    }
}

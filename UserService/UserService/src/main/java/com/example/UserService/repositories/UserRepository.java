package com.example.UserService.repositories;

import com.example.UserService.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    //User is the entity/model that needs jpa
    //custom methods can be applied here
    // through this we can use basic methods like save, find by id etc
}

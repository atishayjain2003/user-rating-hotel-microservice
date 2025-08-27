package com.example.UserService.entitites;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    //Id defines the primary key for the table
    // this is the exact table in the database
    // defining the required user data fields
    private String userId;
    private String name;
    private String emailId;
    private String about;
}

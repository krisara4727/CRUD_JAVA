package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "User")
public class User {
    @Id
    private String _id;
    private String name;
    private int age;
    private String dob;
    private int height;
    private float salary;
    private String profession;

}

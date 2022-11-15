package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.demoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class demoController {

    @Autowired
    private demoRepository demorepository;

    @GetMapping("/get")
    @ResponseBody
    public List<User> getUsers() {
        List<User> user = demorepository.findAll();
        return user;
     }

     @DeleteMapping("/delete/{id}")
     @ResponseBody
     public String deleteUser(@PathVariable String id){
         System.out.println("delete api triggered with id " + id);
        demorepository.deleteById(id);
        return "successfully deleted user with id " + id;
     }

    @PostMapping("/post")
    @ResponseBody
    public String postUser(@RequestBody User user) {
        demorepository.save(user);
        return "successfully saved the user";
    }

    @GetMapping("/home")
    @ResponseBody
    public String demoFunction() {
        return "krishna server started";
    }



}

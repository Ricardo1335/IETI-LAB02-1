package edu.eci.IETILAB021.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.IETILAB021.data.User;
import edu.eci.IETILAB021.dto.UserDto;
import edu.eci.IETILAB021.service.UserService;
@RestController
@RequestMapping( "/v1/user" )
public class UserController {

     private final UserService userService;

     public UserController(@Autowired UserService userService ) {
         this.userService = userService;
     }


     @GetMapping
     public ResponseEntity<List<User>> getAll() {
         //TODO implement this method using UserService
         return null;
     }
    
     @GetMapping( "/{id}" )
     public ResponseEntity<User> findById( @PathVariable String id ) {
        //TODO implement this method using UserService
        return null;
     }
    
    
     @PostMapping
     public ResponseEntity<User> create( @RequestBody UserDto userDto ) {
          //TODO implement this method using UserService
          return null;
     }
    
     @PutMapping( "/{id}" )
     public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id ) {
          //TODO implement this method using UserService
          return null;
     }

     @DeleteMapping( "/{id}" )
     public ResponseEntity<Boolean> delete( @PathVariable String id ) {
          //TODO implement this method using UserService
         return null;      
     }
}

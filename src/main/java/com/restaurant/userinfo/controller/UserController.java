package com.restaurant.userinfo.controller;


import com.restaurant.userinfo.dto.UserInfoDTO;
import com.restaurant.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserInfoDTO> addUser(@RequestBody UserInfoDTO userDTO){
        UserInfoDTO savedUser =  userService.addUser(userDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/fetchUserById/{userId}")
    public ResponseEntity<UserInfoDTO> fetchUserDetailsById(@PathVariable Integer userId){
    	UserInfoDTO userDTO = userService.fetchUserDetailsById(userId);
    	return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }



}

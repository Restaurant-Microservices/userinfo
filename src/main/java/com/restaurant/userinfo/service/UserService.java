package com.restaurant.userinfo.service;

import com.restaurant.userinfo.dto.UserInfoDTO;
import com.restaurant.userinfo.entity.UserInfo;
import com.restaurant.userinfo.mapper.UserMapper;
import com.restaurant.userinfo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    public UserInfoDTO addUser(UserInfoDTO userInfoDTO) {
       UserInfo savedUser = userRepo.save(UserMapper.INSTANCE.mapUserDTOToUser(userInfoDTO));
       return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);

    }

    public UserInfoDTO fetchUserDetailsById(Integer userId) {
         Optional<UserInfo> fetchedUser =  userRepo.findById(userId);
         if(fetchedUser.isPresent())
             return UserMapper.INSTANCE.mapUserToUserDTO(fetchedUser.get());
         else {
        	 return null;
         }
    }
}

package com.restaurant.userinfo.repo;

import com.restaurant.userinfo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserInfo, Integer> {
}

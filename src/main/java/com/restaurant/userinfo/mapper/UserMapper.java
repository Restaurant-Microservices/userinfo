package com.restaurant.userinfo.mapper;

import com.restaurant.userinfo.dto.UserInfoDTO;
import com.restaurant.userinfo.entity.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserInfo mapUserDTOToUser(UserInfoDTO userInfoDTO);
    UserInfoDTO mapUserToUserDTO(UserInfo userINfo);

}

package com.example.mapstruct.demomapstruct.mapper;

import com.example.mapstruct.demomapstruct.entity.user.UserInfo;
import com.example.mapstruct.demomapstruct.entity.user.UserInfoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserInfoMapper {
    UserInfoDTO convertToDto(UserInfo user);
    UserInfo convertToEntity(UserInfoDTO userInfoDTO);
}

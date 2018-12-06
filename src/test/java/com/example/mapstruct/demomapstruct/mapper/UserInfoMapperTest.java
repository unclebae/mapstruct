package com.example.mapstruct.demomapstruct.mapper;

import com.example.mapstruct.demomapstruct.entity.user.UserInfo;
import com.example.mapstruct.demomapstruct.entity.user.UserInfoDTO;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class UserInfoMapperTest {

    private UserInfoMapper mapper = Mappers.getMapper(UserInfoMapper.class);

    @Test
    public void convertUserToDto() {
        final UserInfo userInfoFixture = createUserInfoFixture();
        final UserInfoDTO userInfoDTO = mapper.convertToDto(userInfoFixture);

        assertEquals(userInfoDTO.getNo(), userInfoFixture.getNo());
        assertEquals(userInfoDTO.getName(), userInfoFixture.getName());
        assertEquals(userInfoDTO.getJoinedAt(), userInfoFixture.getJoinedAt());
    }

    @Test
    public void convertUserDtoToUser() {
        final UserInfoDTO userInfoDTO = createUserInfoDtoFixture();
        final UserInfo userInfo = mapper.convertToEntity(userInfoDTO);

        assertEquals(userInfo.getNo(), userInfoDTO.getNo());
        assertEquals(userInfo.getName(), userInfoDTO.getName());
        assertEquals(userInfo.getJoinedAt(), userInfoDTO.getJoinedAt());
    }

    private UserInfoDTO createUserInfoDtoFixture() {
        return UserInfoDTO.builder()
                .no(54321L)
                .userId("Tomato")
                .name("토마토")
                .joinedAt(LocalDateTime.now())
                .build();
    }

    private UserInfo createUserInfoFixture() {

        return UserInfo.builder()
                .no(12345L)
                .userId("KIDO")
                .name("배기도")
                .joinedAt(LocalDateTime.now())
                .build();
    }
}

package com.example.mapstruct.demomapstruct.entity.user;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserInfoDTO {
    private Long no;
    private String userId;
    private String name;
    private LocalDateTime joinedAt;
}

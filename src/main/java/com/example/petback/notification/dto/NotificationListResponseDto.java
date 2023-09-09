package com.example.petback.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class NotificationListResponseDto {
    private List<NotificationResponseDto> notificationResponseDtos;
}

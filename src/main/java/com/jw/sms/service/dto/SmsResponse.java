package com.jw.sms.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SmsResponse {
    private String requestId;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private String statusCode;
    private String statusName;
}

package com.jw.sms.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsRequest {
    private String type;
    private String contentType;
    private String countryCode;
    private String from;
    private String Content;
    private List<MessageDto> messages;
}

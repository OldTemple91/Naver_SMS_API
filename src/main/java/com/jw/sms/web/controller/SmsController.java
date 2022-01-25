package com.jw.sms.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jw.sms.service.SmsService;
import com.jw.sms.service.dto.Request;
import com.jw.sms.service.dto.SmsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
public class SmsController {

    private final SmsService smsService;

    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/user/sms")
    public ResponseEntity<SmsResponse> test(
            @RequestBody Request request
    ) throws NoSuchAlgorithmException, URISyntaxException, UnsupportedEncodingException, InvalidKeyException, JsonProcessingException {
        SmsResponse data = smsService.sendSms(request.getRecipientPhoneNumber(), request.getContent());
        return ResponseEntity.ok().body(data);
    }
}

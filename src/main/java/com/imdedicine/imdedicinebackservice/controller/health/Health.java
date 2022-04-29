package com.imdedicine.imdedicinebackservice.controller.health;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("v1/health")
@Api(value = "Health Controller")
public class Health {

    LocalDateTime localDateTime = LocalDateTime.now();
    LocalTime localTime = localDateTime.toLocalTime();

    @GetMapping("/getDate")
    public ResponseEntity<LocalDateTime> getDate() {
        return ResponseEntity.ok(localDateTime);
    }

    @GetMapping("/getTime")
    public ResponseEntity<LocalTime> getTime() {
        return ResponseEntity.ok(localTime);
    }
}

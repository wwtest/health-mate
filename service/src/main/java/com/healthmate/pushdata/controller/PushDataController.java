package com.healthmate.pushdata.controller;

import com.healthmate.pushdata.entity.HeartRate;
import com.healthmate.pushdata.model.HeartRateRequest;
import com.healthmate.pushdata.service.HeartRateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pushdata")
public class PushDataController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HeartRateService heartRateService;

    @PostMapping("/heartrate")
    public Mono<HeartRate> uploadHeartRate(
        //@RequestBody HeartRateRequest request
        @RequestBody HeartRate heartRate
    ) {
        logger.info("Heart Rate Request {}", heartRate);
        return heartRateService.createHeartRate(heartRate);
    }

    @GetMapping("/heartrate/{imei}")
    public Flux<HeartRate> getHeartRateByImei(
            @PathVariable final String imei
    ) {
        logger.info("Request available Heart Rates with IMEI: {}", imei);
        return heartRateService.findByImei(imei);
    }
}

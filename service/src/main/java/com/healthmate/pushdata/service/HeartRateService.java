package com.healthmate.pushdata.service;

import com.healthmate.pushdata.entity.HeartRate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HeartRateService {
    Mono<HeartRate> createHeartRate(HeartRate heartRate);

    Flux<HeartRate> findAll();

    Mono<HeartRate> findOne(String id);

    Flux<HeartRate> findByImei(String imei);
}

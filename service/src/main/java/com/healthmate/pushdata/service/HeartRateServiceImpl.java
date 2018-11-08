package com.healthmate.pushdata.service;

import com.healthmate.pushdata.entity.HeartRate;
import com.healthmate.pushdata.repository.HeartRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeartRateServiceImpl implements HeartRateService {
    @Autowired
    private HeartRateRepository heartRateRepository;

    @Override
    public Mono<HeartRate> createHeartRate(HeartRate heartRate) {
        return heartRateRepository.insert(heartRate);
    }

    @Override
    public Flux<HeartRate> findAll() {
        return heartRateRepository.findAll();
    }

    @Override
    public Mono<HeartRate> findOne(String id) {
        return heartRateRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("No HeartRate with id: " + id)));
    }

    @Override
    public Flux<HeartRate> findByImei(String imei) {
        return heartRateRepository.findByImei(imei);
    }
}

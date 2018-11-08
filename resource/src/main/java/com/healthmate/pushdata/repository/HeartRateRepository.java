package com.healthmate.pushdata.repository;

import com.healthmate.pushdata.entity.HeartRate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface HeartRateRepository extends ReactiveMongoRepository<HeartRate, String> {
    Flux<HeartRate> findByImei(String imei);
}

package com.healthmate.pushdata.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import javax.validation.constraints.Size;

@Value.Immutable
@JsonDeserialize(as = ImmutableHeartRateRequest.class)
public interface HeartRateRequest {
    @Value.Parameter
    @Size(min=15, max=15)
    String getImei();

    @Value.Parameter
    String getTimeBegin();

    @Value.Parameter
    Integer getHeartRate();

    @Value.Parameter
    Integer getThresholdHeartRateH();

    @Value.Parameter
    Integer getThresholdHeartRateL();
}

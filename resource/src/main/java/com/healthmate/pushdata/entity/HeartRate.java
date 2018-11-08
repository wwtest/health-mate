package com.healthmate.pushdata.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class HeartRate extends BaseEntity {
    private String imei;

    private int heartRate;

    private int thresholdHeartRateH;

    private int thresholdHeartRateL;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getThresholdHeartRateH() {
        return thresholdHeartRateH;
    }

    public void setThresholdHeartRateH(int thresholdHeartRateH) {
        this.thresholdHeartRateH = thresholdHeartRateH;
    }

    public int getThresholdHeartRateL() {
        return thresholdHeartRateL;
    }

    public void setThresholdHeartRateL(int thresholdHeartRateL) {
        this.thresholdHeartRateL = thresholdHeartRateL;
    }
}

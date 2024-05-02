package com.example.project_v2;

public class Bill {
    private String billType; //Electricity, Water, Internet, etc..
    private String billAmount;
    private String frequency; //monthly, weakly, yearly

    public Bill(String billType, String billAmount, String frequency) {
        this.billType = billType;
        this.billAmount = billAmount;
        this.frequency = frequency;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
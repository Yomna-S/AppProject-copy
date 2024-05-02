package com.example.project_v2;

import java.util.Date;

public class Activities {

    private String activityType; //Transation, shopping, restaurant, travel, etc...
    private Date activityDate;
    private double activityAmount;

    public Activities(String activityType, Date activityDate, double activityAmount) {
        this.activityType = activityType;
        this.activityDate = activityDate;
        this.activityAmount = activityAmount;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public double getActivityAmount() {
        return activityAmount;
    }

    public void setActivityAmount(double activityAmount) {
        this.activityAmount = activityAmount;
    }
}

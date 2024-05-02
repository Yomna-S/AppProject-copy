package com.example.project_v2;

import java.util.ArrayList;

public class User {

    private String name;
    private String phoneNumber;
    private String userID;
    private int income;
    private int houseExpenses;
    private ArrayList<Debt> debts;
    private ArrayList<Bill> bills;
    private ArrayList<Goal> goals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getHouseExpenses() {
        return houseExpenses;
    }

    public void setHouseExpenses(int houseExpenses) {
        this.houseExpenses = houseExpenses;
    }

    public ArrayList<Debt> getDebts() {
        return debts;
    }

    public void setDebts(ArrayList<Debt> debts) {
        this.debts = debts;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public void setGoals(ArrayList<Goal> goals) {
        this.goals = goals;
    }
}

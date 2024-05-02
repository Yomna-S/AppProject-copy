package com.example.project_v2;

public class Debt {

    private int debtAmount;
    private double debtIntrest;

    public Debt(int debtAmount, double debtIntrest) {
        this.debtAmount = debtAmount;
        this.debtIntrest = debtIntrest;
    }

    public int getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(int debtAmount) {
        this.debtAmount = debtAmount;
    }

    public double getDebtIntrest() {
        return debtIntrest;
    }

    public void setDebtIntrest(double debtIntrest) {
        this.debtIntrest = debtIntrest;
    }
}

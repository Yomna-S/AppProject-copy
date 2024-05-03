package com.example.project_v2;

import java.util.PriorityQueue;

public class DebtManager {

    private PriorityQueue<Debt> debtQueue;

    public DebtManager() {
        debtQueue = new PriorityQueue<>(new DebtComparator());
    }

    public void addDebt(Debt debt) {
        debtQueue.offer(debt);
    }

    public Debt getNextHighestInterestDebt() {
        return debtQueue.poll();
    }

}

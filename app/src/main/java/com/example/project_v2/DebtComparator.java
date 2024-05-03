package com.example.project_v2;

import java.util.Comparator;

public class DebtComparator implements Comparator<Debt> {

    public int compare(Debt debt1, Debt debt2) {
        // Revert comparison for max-heap (highest interest first)
        return Double.compare(debt2.getDebtIntrest(), debt1.getDebtIntrest());
    }
}

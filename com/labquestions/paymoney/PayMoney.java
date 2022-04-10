package com.labquestions.paymoney;

import com.labquestions.utility.BinarySearch;

import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of transaction array: ");
        int transactionCount = sc.nextInt();
        int [] transactions = new int[transactionCount];

        System.out.println("Enter the values of array: ");
        for (int i = 0; i < transactionCount; i++) {
            transactions[i] = sc.nextInt();
        }

        int [] cumulativeTransactions = new int[transactionCount];
        cumulativeTransactions[0] = transactions[0];
        for (int i = 1; i < transactionCount; i++) {
            cumulativeTransactions[i] = transactions[i] + cumulativeTransactions[i - 1];
        }

        System.out.println("Enter the total no of targets that needs to be achieved: ");
        int targetCount = sc.nextByte();

        for (int i = 0; i < targetCount; i++) {
            System.out.println("Enter the value of target: ");
            int target = sc.nextInt();

            int transactionIndex = BinarySearch.forUpperBound(target, cumulativeTransactions);
            if (transactionIndex == -1)
                System.out.println("The target is not achieved. \n");
            else
                System.out.printf("Target achieved after %d transactions. \n\n", transactionIndex + 1);
        }

        sc.close();
    }
}

package com.labquestions.traveller;

import com.labquestions.utility.Comparator;
import com.labquestions.utility.MergeSort;

import java.util.Scanner;

public class Denomination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations: ");
        int denominationCount = sc.nextInt();
        int [] denominations = new int[denominationCount];

        System.out.println("Enter the currency denominations value: ");
        for (int i = 0; i < denominationCount; i++) {
            denominations[i] = sc.nextInt();
        }

        System.out.println("Enter the amount you want to pay: ");
        int amount = sc.nextInt();

        sc.close();

        // Solving for minimum notes by Greedy Approach
        new MergeSort(Comparator.descending).sort(denominations);

        for (int currentDenomination : denominations) {
            if (amount >= currentDenomination) {
                System.out.println(currentDenomination + ":" + amount/currentDenomination);
                amount %= currentDenomination;
            }
            if (amount == 0)    break;
        }

    }
}

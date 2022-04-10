package com.labquestions.main;

import com.labquestions.paymoney.PayMoney;
import com.labquestions.traveller.Denomination;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Choose a problem: \n 1. PayMoney \n 2. Denominations ");

        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 1:
                PayMoney.main(args);
                break;
            case 2:
                Denomination.main(args);
                break;
            default:
                System.out.println("Invalid option. ");
        }
    }
}

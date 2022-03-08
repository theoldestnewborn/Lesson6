package com.company;

import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    int currentSum;
    int addedSum;
    int takeSum;

    public CreditCard (int accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    int addMoney(int addSum){
        addedSum = addSum;
        currentSum += addedSum;
        return currentSum;
    }

    int withdrawMoney (int takeSum) {
        this.takeSum = takeSum;
        if (currentSum < takeSum) {
            do {
                System.out.println("Not enough money!");
                return currentSum; }
            while (currentSum < takeSum);
            } else {  currentSum -= takeSum;
                return currentSum;
            }
    }

    void cardInfo () {
        System.out.println();
        System.out.println("Номер счета - " + accountNumber + "\nТекущий остаток - " + currentSum);
        System.out.println();
    }

    }


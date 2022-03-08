package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        CreditCard card1 = new CreditCard(15351, 300);
        CreditCard card2 = new CreditCard(15352, 500);
        CreditCard card3 = new CreditCard(15353, 150);

        System.out.printf("Which card would you like to use?");
        int cardChoice = sc1.nextInt();

        switch (cardChoice) {

            case 1:
                System.out.println("На вашем счету - " + card1.currentSum + ". Какую сумму вы хотели бы положить на счет "
                        + card1.accountNumber + "?");
                int x1 = sc1.nextInt();
                int sumNew1 = card1.addMoney(x1);
                System.out.println("У вас на счету - " + sumNew1);

                card1.cardInfo();

                System.out.println("Какую сумму вы хотели бы снять со счета?");

                for (; ; ) {
                    int y1 = sc1.nextInt();
                    if (y1 > sumNew1) {
                        System.out.println("У вас недостаточно средств! Попробуйте еще раз");

                    } else {
                        int sumLeft = card1.withdrawMoney(y1);
                        System.out.println("На вашем счету осталось " + sumLeft);
                        card1.cardInfo();
                        return;
                    }
                }

            case 2:
                System.out.println("На вашем счету - " + card2.currentSum + ". Какую сумму вы хотели бы положить на счет "
                        + card2.accountNumber + "?");
                int x2 = sc1.nextInt();
                int sumNew2 = card2.addMoney(x2);
                System.out.println("У вас на счету - " + sumNew2);

                card2.cardInfo();

                System.out.println("Какую сумму вы хотели бы снять со счета?");

                for (; ; ) {
                    int y2 = sc1.nextInt();
                    if (y2 > sumNew2) {
                        System.out.println("У вас недостаточно средств! Попробуйте еще раз");

                    } else {
                        int sumLeft2 = card2.withdrawMoney(y2);
                        System.out.println("На вашем счету осталось " + sumLeft2);
                        card2.cardInfo();
                        return;
                    }
                }


            case 3:
                System.out.println("На вашем счету - " + card3.currentSum + ". Какую сумму вы хотели бы положить на счет "
                        + card3.accountNumber + "?");
                int x3 = sc1.nextInt();
                int sumNew3 = card3.addMoney(x3);
                System.out.println("У вас на счету - " + sumNew3);

                card3.cardInfo();

                System.out.println("Какую сумму вы хотели бы снять со счета?");

                for (; ; ) {
                    int y3 = sc1.nextInt();
                    if (y3 > sumNew3) {
                        System.out.println("У вас недостаточно средств! Попробуйте еще раз");

                    } else {
                        int sumLeft3 = card3.withdrawMoney(y3);
                        System.out.println("На вашем счету осталось " + sumLeft3);
                        card3.cardInfo();
                        return;
                    }
                }




        }
    }
}



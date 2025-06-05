package university.Project;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ATMOperationIMP op = new ATMOperationIMP();
        Scanner in = new Scanner(System.in);
        int atmNumberSaved = 12345;
        int atmPinSaved = 123;
        System.out.println("Welcome to ATM Machine");
        System.out.print("Enter ATM number : ");
        int atmNumberTyped = in.nextInt();
        System.out.print("Enter PIN        : ");
        int pinTyped = in.nextInt();
        if (atmNumberTyped == atmNumberSaved && pinTyped == atmPinSaved) {
            while (true) {
                System.out.println("1.VIEW AVAILABLE BALANCE\n2.WITHDRAW AMOUNT\n3.DEPOSIT AMOUNT\n4.VIEW MINI STATEMENT \n5.EXIT");
                System.out.print("Enter Choice : ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter Amount To Withdraw");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.println("enter amount to deposit");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);

                } else if (ch == 4) {
                  op.viewMiniStatement();
                } else if (ch == 5) {
                    System.out.println("Collect your Atm card ./n ThankYou for using the machine ");
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice");
                }

            }
        } else {
            System.out.println("Incorrect ATM number or PIN ❌");// one or both don’t match
            System.exit(0);
        }
    }
}
package university.Project;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationIMP  {
    ATM atm = new ATM();
    Map<Double, String> ministmt = new HashMap<>();

//    @Override
    public void viewBalance() {
        System.out.println("Available balance is " + atm.getBalance());
    }

//    @Override
    public void withdrawAmount(double withdrawAmount) {
         if (withdrawAmount % 500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, "Amount Withdrawn");
                System.out.println(withdrawAmount + "collect the cash");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient funds");
            }
        }else{
            System.out.println("please enter the amount in multiple of five hundred");
        }
    }

//    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully ");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

//    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> n : ministmt.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());

        }
    }
}

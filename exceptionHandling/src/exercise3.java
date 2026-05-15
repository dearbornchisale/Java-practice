import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

public class exercise3 {
    public static BankAccount findAccount(ArrayList<BankAccount> accounts, String accountNumber) throws AccountNotFoundException{

        for(BankAccount a : accounts){
            if(a.getAccountNumber().equals(accountNumber)){
                return a;
            }
        }

        throw new AccountNotFoundException("Account not found!!");

    }

    public static void processTransaction(BankAccount account, String type, double amount){
        Scanner input = new Scanner(System.in);

        System.out.print("Withdraw or Deposit: ");
        type = input.next();

        if(type.equalsIgnoreCase("Withdraw")){
            try{
                
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();


        System.out.print("Hello world");
    }
}

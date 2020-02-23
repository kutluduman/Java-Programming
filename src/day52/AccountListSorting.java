package day52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {


        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Jon", 10000));
        accounts.add(new Account("Vlad", 11000));
        accounts.add(new Account("Svetlana", 13000));
        accounts.add(new Account("Emme", 17000));
        accounts.add(new Account("Muhammad", 8000));
        accounts.add(new Account("Ata", 15000));


        System.out.println("accounts before sorting = " + accounts);
        Collections.sort(accounts);
        System.out.println("--------------------------");
        System.out.println("accounts after sorted = " + accounts);

        // Create another account with your name :
        // transfer everyone's money to your account

        System.out.println("--------------------------");

        Account myAccount = new Account("Kutluhan", 0);

        for (Account each : accounts) {

            each.transferAll(myAccount);

        }

        System.out.println("myAccount = " + myAccount);

        // what can be the data type of a1

        // Account a1 ;
        // Comparable a1;
        // Transferable a1;
        // Object a1 ;


        Account a1 = new Account("Polymorphism", 10000);

        Transferable t1 = new Account("Polymorphism2", 10000);

        Object o1 = new Account("Polymorphism3", 10000);


    }
}

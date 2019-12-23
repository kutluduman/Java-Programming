package day17;

import java.util.Scanner;

public class Warm_Up_FullName_Corrector {


    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("What's your full name : ");

        String fullName = scan.nextLine();
        System.out.println(fullName);

  //      int firstSpace = fullName.indexOf(" ");
  //      System.out.println(firstSpace);

        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") +1);

      String firstNameCorrected = firstName.toUpperCase().substring(0,1) +
                                    firstName.toLowerCase().substring(1);

  //      System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1) +
                                    lastName.toLowerCase().substring(1);


        String fullNameCorrected = firstNameCorrected+" "+lastNameCorrected;

        System.out.println(fullNameCorrected);


    }
}

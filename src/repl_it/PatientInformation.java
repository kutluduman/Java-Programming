package repl_it;

import java.util.Scanner;


public class PatientInformation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");

        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String name = scan.nextLine();

        System.out.println("Enter your last name");
        String surname = scan.nextLine();

        System.out.println("Enter your email");
        String email = scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        String zipCode = scan.nextLine();


        System.out.println("Enter your work phone number");
        String workPhoneNo = scan.nextLine();

        System.out.println("Enter your personal phone number");
        String personalPhoneNo = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        int height = scan.nextInt();

        System.out.println("Enter your weight");
        int weight = scan.nextInt();

        System.out.println("Are you married");
        boolean marriedStatus = scan.nextBoolean();

     String contacts = ("work phone number - " + workPhoneNo + ", personal phone number - " +
             personalPhoneNo + ", email:" + email);

     String fullName = name + ", " + surname ;

     String address = street + ", " + city + "," + state + ", " + zipCode;

        System.out.println("Patient personal Information");
        System.out.println( "Full name: " + fullName + "\n" + "Address: " + address + "\n" + "Contacts: " + contacts + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + "\n" + "Weight: " +
                + weight + "\n" + "Married?: " + marriedStatus );



    }

}

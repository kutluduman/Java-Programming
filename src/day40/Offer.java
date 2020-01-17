package day40;

public class Offer {


    String location;
    String company;
    long salary;
    boolean isFullTime;

    /*
        this is a instance method to print all the information about Offer object

     */

    // inside instance method we can directly access instance variable

    public void displayOfferDetails() {

        System.out.println("Location = " + location + " | " + "Company = " + company + " | "
                + "Salary = " + salary + " | " + "isFullTime = " + isFullTime);


    }

    // Write a method called turnToFullTime

    public void turnToFullTime() {

        if (isFullTime == false) {

            isFullTime = true;


        } else {

            System.out.println("Already full time");
        }


    }

    // Write a method to change the location of the Offer
    // to the location user passed

    public void changeLocation(String newLocation) {

        location = newLocation;


    }

    // write a method to accept 4 parameters to change all info
    // about offers

    public void changeAllInfo(String newCompany, String newLocation
            , Long newSalary, boolean newIsFullTime) {


        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        // an instance method can call another instance method
        // an instance method can use any instance fields
        //since we already have functionality to display information
        // we called it here to display new information after modifying

        displayOfferDetails();

    }

    // write a method to check the offer belong to 100k
    // club and return the result as true false


    public boolean is100KOffer(){


        // salary>= 100000 already generate a boolean result
        // so we can directly return that result

        return salary>=100000;


    }

    /**
     * Create an instance method called toString
     * has no parameter
     * return String representation of Offer Object
     */

    public String toString(){



        return "Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = $" + salary + " | " +
                "isFullTime = " + isFullTime;

    }


}

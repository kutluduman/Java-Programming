package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {


        String citizenType ;
        int age = 68 ;

        if ( age > 65) {


            citizenType = "Senior";


        } else {

            citizenType = "Not-senior";
        }


        System.out.println(citizenType);
        System.out.println("The citizen age is " +age + ", and the citizen is a " +citizenType);


        }


}

package day08;

public class IfStatement {


    public static void main(String[] args) {


        int speedLimit = 60 ;
        int yourCurrentSpeed = 100 ;

        boolean amISpeeding = ( yourCurrentSpeed>speedLimit ) ;


        if (amISpeeding) {

            System.out.println("Get pulled over by the police");
            System.out.println("Given ticket by police");
            System.out.println("Taken away some point on your license");
            System.out.println("Go to court");

        } else {

            System.out.println("Go shopping ! ");
            System.out.println("Go buy ice cream ! ");
        }


    }
}

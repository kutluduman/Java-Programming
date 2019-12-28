package day33;

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {

        System.out.println(convertNumberToDay(2));

        System.out.println();
        
        int[] allCodes = {5,3,11,4,33} ;

        for (int i = 0; i <allCodes.length ; i++) {
            
            String day = convertNumberToDay(allCodes[i]);
            System.out.println("day = " + day);
            
        }

        System.out.println();

        for (int   eachCode : allCodes  ) {

            System.out.println(convertNumberToDay(eachCode));

        }
        

    }

    public static String convertNumberToDay(int dayCode) {

        String day = "";

        if (dayCode == 1) {

            day = "Monday";

        } else if (dayCode == 2) {

            day = "Tuesday";
        } else if (dayCode == 3) {

            day = "Wednesday";
        } else if (dayCode == 4) {

            day = "Thursday";
        } else if (dayCode == 5) {

            day = "Friday";
        } else if (dayCode == 6) {

            day = "Saturday";
        } else if (dayCode == 7) {

            day = "Sunday";
        } else {

            day = "FunDay";
        }


        return day;


    }


}

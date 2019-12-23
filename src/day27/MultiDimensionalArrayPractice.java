package day27;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {


        String[] developersTeam ={"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam ={"Zhibekchach", "Mohammed Sohrabi","Hasan Mammadov"};
        String[] businessAnalystItTeam = {"Lisa", "Ershad", "Naila" } ;


        String[][] scrumTeam = {developersTeam,testersTeam,businessAnalystItTeam};

        String  longestString = "";
        int maxLength = scrumTeam[0][0].length();
        
        for ( String[] each1DArray  :  scrumTeam   ) {
            
            for (String eachElement    :   each1DArray    ) {
                
               if (maxLength<eachElement.length()) {
                   
                maxLength= eachElement.length();

                longestString=eachElement;
                   
               }
            
            }
         
        }

        System.out.println("maxLength = " + maxLength); // longest name has 16 characters
        System.out.println(longestString);


        String shortestString = "";
        int minLength  = scrumTeam[0][0].length();

        for (String[] each1DArray  : scrumTeam    ) {


            for (String eachElement : each1DArray) {




            }

        }





    }
}

package day27;

public class FindShortestString {

    public static void main(String[] args) {

        String[] developersTeam ={"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam ={"Zhibekchach", "Mohammed Sohrabi","Hasan Mammadov"};
        String[] businessAnalystItTeam = {"Lisa", "Ershad", "Naila" } ;


        String[][] scrumTeam = {developersTeam,testersTeam,businessAnalystItTeam};

        String shortestString = "";
        int minLength  = scrumTeam[0][0].length();

        for (String[] each1DArray  : scrumTeam    ) {


            for (String eachElement : each1DArray) {

                if (minLength>eachElement.length()) {

                    minLength=eachElement.length();

                    shortestString=eachElement;

                }

            }

        }

        System.out.println(shortestString);
        
        
        // Another Method of Solving:
        int minLength2 = scrumTeam[0][0].length();
        String shortestString2 = scrumTeam[0][0];

        for (int i = 0; i <scrumTeam.length ; i++) {

            for (int j = 0; j <scrumTeam[i].length ; j++) {
                
                if (minLength2>scrumTeam[i][j].length()) {
                    
                    minLength2=scrumTeam[i][j].length();
                   
                    shortestString2=scrumTeam[i][j];
                    
                }

            }

        }

        System.out.println("shortestString2 = " + shortestString2);
        

    }
}

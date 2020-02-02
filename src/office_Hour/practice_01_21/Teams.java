package office_Hour.practice_01_21;

public class Teams {

    public static void main(String[] args) {

        BOATeams.companyName="BOA";


        BOATeams team1 = new BOATeams();
        team1.teamName = "eagles";
        team1.teamSize = 9;



        BOATeams team2 = new BOATeams();
        team2.teamName = "BugBusters";
        team2.teamSize = 12;


       ScrumTeam scrum1 = new ScrumTeam();
       scrum1.standUp();
       scrum1.teamSize=9;


        System.out.println(scrum1.companyName);
        System.out.println(team2.companyName);

    }
}

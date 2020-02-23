package office_Hour.Practice_02_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {

    public static void main(String[] args) {

        Testers tester1 = new Testers("Steve Jobs", "CEO", 500000);

        tester1.getEmployeeInfo();


        Testers tester2 = new Testers("Alisa", "SDET", 120000);

        Testers tester3 = new Testers("Rauf", "QA", 100000);

        System.out.println("-----------------------");


        List<Testers> testersTeam = new ArrayList<>();
        testersTeam.addAll(Arrays.asList(tester1, tester2, tester3));

        for (Testers each : testersTeam ) {

            each.getEmployeeInfo();
            System.out.println("=======================");

        }

        Developers developer1 = new Developers("Vlad", 130000);

        developer1.getEmployeeInfo();

        System.out.println("===================");

        Developers developer2 = new Developers("Emel",135000);

        Developers developer3 = new Developers("Muge", 140000);


        List<Developers> developersTeam = new ArrayList<>();
        developersTeam.addAll(Arrays.asList(developer1,developer2,developer3));

        for (Developers eachDeveloper: developersTeam ) {

            eachDeveloper.getEmployeeInfo();
            System.out.println("=======================");

        }

        List<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(testersTeam); //parent class can be reference to the child class's object
        scrum.addAll(developersTeam);

        for (ScrumTeam eachScrum : scrum) {

            eachScrum.getEmployeeInfo();
            System.out.println("============================");

        }


    }
}

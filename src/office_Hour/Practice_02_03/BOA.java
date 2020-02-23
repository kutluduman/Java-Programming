package office_Hour.Practice_02_03;

import java.util.ArrayList;
import java.util.Arrays;

public class BOA {

    public static void main(String[] args) {


        BA business1 = new BA("Mohammed", 80000);
        BA business2 = new BA("Kevin", 86000);
        BA business3 = new BA("Roger", 90000);

        ArrayList<BA> businessTeam = new ArrayList<>();
        businessTeam.addAll(Arrays.asList(business1, business2, business3));

        for (BA eachTeam : businessTeam) {

            eachTeam.getEmployeeInfo();
            System.out.println("=====================");

        }

        Testers Sevim = new Testers("Sevim", "QA", 120000);
        Testers Gunel = new Testers("Gunel", "Manual Tester", 110000);
        Testers Serife = new Testers("Serife", "SDET", 115000);

        Testers[] testers = {Sevim, Gunel, Serife};
        BA[] BATeam = {business1, business2};

        ScrumTeam[][] scrum = {testers, BATeam};

        for (ScrumTeam[] eachArray : scrum) {
            for (ScrumTeam eachMember : eachArray) {
                eachMember.getEmployeeInfo();
            }

        }


    }
}

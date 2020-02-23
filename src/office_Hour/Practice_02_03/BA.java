package office_Hour.Practice_02_03;

public class BA extends ScrumTeam {


    public BA(String employeeName, double salary) {

        this.jobTitle = "Business Analyst";
        this.employeeName = employeeName;
        this.salary = salary;

    }


    public void demo() {

        System.out.println("BA " + this.employeeName + " is attending to demo");

    }

    public void dailyStandUp() {

        System.out.println("BA " + this.employeeName + " is attending daily stand up");

    }

    public void requirement() {

        System.out.println("BA" + this.employeeName + " gathering requirements");
    }

}

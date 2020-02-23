package office_Hour.Practice_02_03;

public class Developers extends ScrumTeam {


    public Developers(String employeeName, double salary) {

        this.employeeName = employeeName;
        this.jobTitle = "Software Developer";
        this.salary = salary;


    }

    @Override
    public void demo() {

        System.out.println("Developer " + employeeName + " is doing demo");

    }

    @Override
    public void dailyStandUp() {

        System.out.println("Developer " + employeeName + " is having daily stand up");

    }

    public void fixingBugs() {

        System.out.println("Developer " + this.employeeName + " fixing the bug");

    }


}

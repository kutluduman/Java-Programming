package office_Hour.Practice_02_03;

public abstract class ScrumTeam {

    public String employeeName;
    public String jobTitle;
    public double salary;


    public abstract void demo();
    public abstract void dailyStandUp();

    public void getEmployeeInfo(){

        System.out.println("employeeName = " + employeeName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        
    }






}

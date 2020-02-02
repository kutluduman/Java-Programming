package day48;

public class HourlyEmployee extends Employee {


    double hourlyWage;
    int numOfHours;

    public HourlyEmployee(String name, int id, double hourlyWage, int numOfHours) {

        super(name,id);
        this.hourlyWage = hourlyWage;
        this.numOfHours = numOfHours;


    }


    public void calculateAnnualSalary() {

        double annualSalary = hourlyWage * numOfHours * 12;
        System.out.println("annualSalary of HourlyEmployee = "
                + annualSalary);


    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numOfHours=" + numOfHours +
                ", name='" + name + '\'' +
                ", id=" + id + ", yearly salary is " + hourlyWage * numOfHours * 12+
                '}';
    }
}

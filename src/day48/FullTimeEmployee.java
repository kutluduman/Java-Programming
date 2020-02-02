package day48;

// a non - abstract sub class of abstract super class
// is called concrete class
// This class is responsible to provide body (implementation)
// for all abstract methods from super class


public class FullTimeEmployee extends Employee {

    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {

        super(name, id);
        this.monthlySalary = monthlySalary;

    }


    public void calculateAnnualSalary() {

        System.out.println(monthlySalary * 12 + " is the fulltime employee yearly income");

    }

    @Override

    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

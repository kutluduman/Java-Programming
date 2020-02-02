package day48;

public class HR_Action {

    public static void main(String[] args) {

    HourlyEmployee e1 = new HourlyEmployee("Kevin",124,40,8);
    e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);


    FullTimeEmployee f1 = new FullTimeEmployee("Adrian", 1251, 10000);
    f1.calculateAnnualSalary();
        System.out.println("f1 = " + f1);

        // each and every class we create , it will become a data type (reference type)

    }
}

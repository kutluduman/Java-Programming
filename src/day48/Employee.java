package day48;

public abstract class Employee {

    String name;
    int id;


    public Employee(){



    }

    // Why do we have constructor here
    // we can not create an object out of it?
    // what is the point?
    // so that sub class can reuse the code of setting id and name

    public Employee(String name, int id) {

        this.name=name;
        this.id=id;

    }


    public abstract void calculateAnnualSalary();

    public abstract String toString(); // this is optional : the only reason we put it in here was
                                        // to enforce sub class to provide toString method




}

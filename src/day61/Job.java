package day61;

public class Job implements Comparable<Job> {

    private String location;
    private double salary;
    private String companyName;

    public Job(String location, double salary, String companyName) {

        this.location = location;
        this.salary = salary;
        this.companyName = companyName;

    }

    public String getLocation() {
        return location;

    }

    public void setLocation(String location) {

        this.location = location;
    }


    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


    public int compareTo(Job other) {

        if (this.salary > other.salary) {

            return 1;

        } else {

            return -1;

        }
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

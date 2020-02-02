package day44;

public class CyberHouse {

    // we can change default value of the fields
    // by assigning value directly in the template class

    int houseNum;
    String design;
    private static String neighbourhoodName= "Cybertek Ave";



    // constructor can access anything
    public CyberHouse(int houseNum, String design) {

        this.houseNum = houseNum;
        this.design = design;


    }

    // instance method can access anything
    public void showAllInfo() {

        System.out.println("House number is " + houseNum + ", design is " + design + ", and neighbourhood name is "
                + neighbourhoodName);


    }

    // static method can only access static members of same class
    public static void showNeighbourhood() {

        System.out.println("neighbourhoodName = " + neighbourhoodName);
        // can not access anything non static inside static meethods
        // sout : houseNum


    }


}

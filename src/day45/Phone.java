package day45;

public class Phone extends Electronic {

    // Sub class inherit every visible instance field and static field
    // Sub class inherit every visible instance method and static method

    double size;
    double price;


    // bad idea to have main here
    // but we are doing it anyway for less screen to look at

    public static void main(String[] args) {


        Phone p1 = new Phone();

        p1.size = 12;
        p1.price = 399;

        p1.brand = "apple";

        // directly accessing the static field of same class in static method
        System.out.println(Phone.useElectricity);

        p1.showBrand();

        displayUseElectricity();


    }


}

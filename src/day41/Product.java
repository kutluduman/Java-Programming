package day41;

public class Product {

    // "this" keyword can be used to refer the current object
    // we are working on


    private String name;
    private double price;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    //    public void setName(String name) {
//
//        this.name = name;
//
//
//    }
//
//    public String getName() {
//
//
//        return this.name;
//    }
//
//
//    public void setPrice(double price) {
//
//        if (this.price > 0) {
//
//
//            this.price = price;
//
//
//        }
//
//
//    }
//
//    public double getPrice() {
//
//
//        return this.price;
//    }


}

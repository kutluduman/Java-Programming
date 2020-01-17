package day39;

public class SplitPractice {

    public static void main(String[] args) {

        SplitPractice s1 = new SplitPractice();

        String itemDetails = "iPhone 6s,449,18.71";

        String[] arrSplit = itemDetails.split(",");


        String name = arrSplit[0];
        System.out.println("name = " + name);

        Double price = Double.parseDouble(arrSplit[1]);
        System.out.println("price = " + price);

        Double monthly = Double.parseDouble(arrSplit[2]);
        System.out.println("monthly = " + monthly);


    }
}

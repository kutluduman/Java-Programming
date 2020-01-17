package day39;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        ArrayList<String> productList = new ArrayList<>(Arrays.asList
                ("iPhone 6s,449,18.71",
                        "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16",
                        "MacbookPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68",
                        "Beats HeadPhones,349.99,15.12",
                        "Mous,79.99,8.98",
                        "Charger,39.99,4.56",
                        "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25",
                        "TV,2199,89.49",
                        "Apple Watch,559,21.18"));

        System.out.println("product list = " + productList);

        System.out.println("productList element item count = " + productList.size());

        String itemDetails = "iPhone 6s,449,18.71";


        System.out.println("itemDetails name = " + itemDetails.split(",")[0]);
        System.out.println("itemDetails price = " + itemDetails.split(",")[1]);
        System.out.println("itemDetails monthly = " + itemDetails.split(",")[2]);


        // Print only items name :

        for (String eachProduct : productList) {

            String namePart = eachProduct.split(",")[0];

            System.out.println("Product name : " + namePart);


        }

        // Print all the prices more than 500

        for (String eachPrice : productList) {

            String price = eachPrice.split(",")[1];

            Double priceD = Double.parseDouble(price);

            if (priceD > 500) {

                System.out.println("priceD = " + priceD);

            }


        }


        // print average price :

        double sum = 0;
        double average = 0;

        for (String eachPrice : productList) {


            Double price = Double.parseDouble(eachPrice.split(",")[1]);

            sum += price;

            System.out.println("sum = " + sum);

            average = sum / productList.size();

            System.out.println("average = " + average);


        }

        // print all the items name that has less than 20$ monthly payment


        for (String eachMonth : productList) {

            Double month = Double.parseDouble(eachMonth.split(",")[2]);

            String name = eachMonth.split(",")[0];

            if (month < 20) {

                System.out.println("name = " + name);


            }


        }

        // print the monthly payments of all the iPhone no matter what model

        for (String eachProduct : productList) {

            String productName = eachProduct.split(",")[0];

            Double monthlyPrice = Double.parseDouble(eachProduct.split(",")[2]);

            if (productName.contains("iPhone")) {

                System.out.println("monthlyPrice = " + monthlyPrice);
            }


        }

        // Print all information about most expensive item :

        double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
        String maxPriceItem = "";

        for (String eachProduct : productList) {

            Double price = Double.parseDouble(eachProduct.split(",")[1]);

            if (price > maxPrice) {

                maxPrice = price;
                maxPriceItem = eachProduct;

            }


        }

        System.out.println("maxPriceItem = " + maxPriceItem);
        System.out.println("maxPrice = " + maxPrice);


        // Update Dyson price to 80% off


        for (String eachProduct : productList) {

            String name = eachProduct.split(",")[0];

            Double priceDyson = Double.parseDouble(eachProduct.split(",")[1]);

            if (name.startsWith("Dyson")) {


                priceDyson = priceDyson - (priceDyson * 0.8);

            }

            System.out.println("priceDyson = " + priceDyson);

        }

        // count the items that are more than average price

        int count = 0;


        for (String eachProduct : productList) {

            Double price = Double.parseDouble(eachProduct.split(",")[1]);

            if (price > average) {

                count++;


            }


        }

        System.out.println("count = " + count);


        // Remove all the items that have more than average price(Do not use for each loop for removing)

        for (int i = 0; i < productList.size(); i++) {

            double price = Double.parseDouble(productList.get(i).split(",")[1]);

            if (price > average) {


                productList.remove(i);
                --i;

            }

        }

        System.out.println("productList size = " + productList.size());


        // Create 3 more ArrayList objects to separately store
        // itemNames(String), prices(Double), monthlyPayments(Double) ;

        ArrayList<String> itemNames = new ArrayList<>();

        ArrayList<Double> prices = new ArrayList<>();

        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for (String eachProduct : productList) {

            String name = eachProduct.split(",")[0];
            Double price = Double.parseDouble(eachProduct.split(",")[1]);
            Double monthlyPayment = Double.parseDouble(eachProduct.split(",")[2]);

            itemNames.add(name);
            prices.add(price);
            monthlyPayments.add(monthlyPayment);


        }

        System.out.println("itemNames = " + itemNames);

        System.out.println("prices = " + prices);

        System.out.println("monthlyPayments = " + monthlyPayments);

    }

}

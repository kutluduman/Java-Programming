package day56;

import java.util.ArrayList;
import java.util.List;

// How does contains decide you have an object you are looking for in your list ?
// it will call .equals method of that type , if it's overridden to check for content
// then it will return desired result according to the content (attributes)
// else it will always return false

// same thing for remove ? how can i remove an item from the list using remove method that accept object ?
// first it decide whether you have that object or not by checking using contain method .
// if you have it then you remove ,  if contains return false you can not remove because we cant remove what we don't have

public class ProductListPractice {

    public static void main(String[] args) {


        List<Product> productList = new ArrayList<>();

        productList.add(new Product("MacBook Pro", 2999));
        productList.add(new Product("Sony TV", 499));
        productList.add(new Product("MacBook Air", 1299));
        productList.add(new Product("Iphone X", 999));
        productList.add(new Product("Iphone XL", 1299));
        productList.add(new Product("Samsung 10", 1188));
        productList.add(new Product("Samsung Note", 1288));

        System.out.println("productList.size() = " + productList.size());


        // How does contains method decide whether the list contains the object we are looking for ?
        // it will internally call the equals method of that type(Product here)
        // if it returns true then contains method will return true, if not, return false

        boolean result = productList.contains(new Product("Sony TV", 499));
        System.out.println("result of Sony Tv contains in the list = " + result);

        productList.remove(new Product("Sony TV", 499));
        boolean result3 = productList.contains(new Product("Sony TV", 499));
        System.out.println("result of Sony Tv contains in the list = " + result3);

        boolean result2 = productList.contains(new Product("Apple TV",399));
        System.out.println("result2 of Apple tv contains in the list = " + result2);


        // check whether we have Sony TV with price 499
        /*boolean result = false;

        for (Product each : productList) {

            if (each.getName().equals("Sony TV") && each.getPrice() == 499) {

                result = true;

            }


        }

        System.out.println("Has Sony TV, with 499 or not result = " + result);*/

    }
}

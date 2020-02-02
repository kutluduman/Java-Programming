package day43;

public class Starbucks {

    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        Coffee c2 = new Coffee("Frappucino", 3);
        Coffee c3 = new Coffee("Frappucino", 3, 2.99);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);


        c1.setType("Americano");
        c1.setPrice(4);
        c1.setCaffeineLevel(6);


        System.out.println("c1.getType() = " + c1.getType());
        System.out.println("c1.getPrice() = " + c1.getPrice());
        System.out.println("c1.getCaffeineLevel() = " + c1.getCaffeineLevel());

        double sumOfAllCoffee=c1.getPrice()+c2.getPrice()+c3.getPrice();

        System.out.println("sumOfAllCoffee = " + sumOfAllCoffee);
        
        
        c2.setPrice(-4.99);


        System.out.println("c2.getPrice() = " + c2.getPrice());
        
    }


}

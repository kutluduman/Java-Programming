package Recap;

public class RecapOperators {

    public static void main(String[] args) {

        boolean result = !false != ("Batch 12" != "Best Batch Ever");
        // true != true = false

        System.out.println("result = " + result);

        System.out.println();

        int x = 100;
        double y = x += 100 / 20;
        // 105

        System.out.println("x = " + x);

        System.out.println(105.0 > 105); // Java gives false

        System.out.println(105.1 > 105); // TRUE

        System.out.println();

        int num1 = 100;
        num1 += 300;

        System.out.println(num1++ + " " + num1);


    }
}

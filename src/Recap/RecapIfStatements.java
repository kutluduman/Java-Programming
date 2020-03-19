package Recap;

public class RecapIfStatements {

    public static void main(String[] args) {

        if (true) {

            System.out.println("Hello");
            System.out.println("Happy Friday");
            System.out.println("Tomorrow is day off");

        }

        if (9 > 10) {

            System.out.println("Hello");
            System.out.println("Happy Friday");
            System.out.println("Tomorrow is day off");

        }

        int a = 1000;

        if (a++ == 1001) {
            // 1000 == 1001 ---> false because of the post increment

            a = 2000;
            System.out.println("a is increased");

        }
        System.out.println(a); // 1001 because of the later stage of post increment


    }
}

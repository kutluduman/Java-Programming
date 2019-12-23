package day32;

public class NumberAction {

    public static void main(String[] args) {

        numberComparision(14, 12);
        System.out.println();
        skipCountBy3From0to50();
        System.out.println();
        countDownByEvenNumberFrom50to0();
        System.out.println();
        print1toX(10);
        System.out.println();
        stringRepeater("John", 5);
        System.out.println();
        countDownByEvenNumberFromXtoY(10, 5);

    }

    public static void numberComparision(int num1, int num2) {

        if (num1 > num2) {

            System.out.println(num1);


        } else if (num2 > num1) {

            System.out.println(num2);


        } else {

            System.out.println("They are equal");

        }


    }


    public static void stringRepeater(String strToRepeat, int count) {

        for (int i = 1; i <= count; i++) {

            System.out.print(strToRepeat + " ");

        }


    }

    public static void skipCountBy3From0to50() {


        for (int i = 0; i <= 50; i += 3) {

            System.out.print(i + " ");

        }


    }

    public static void countDownByEvenNumberFrom50to0() {

//        for (int i = 50; i >= 0; i--) {
//
//            if (i % 2 == 0) {
//
//                System.out.print(i + " ");
//            }
//
//        }

        countDownByEvenNumberFromXtoY(50,0);


    }

    public static void print1toX(int x) {

        for (int i = 1; i <= x; i++) {

            System.out.print(i + " ");

        }
        System.out.println();


    }

    public static void countDownByEvenNumberFromXtoY(int x, int y) {

        for (int i = x; i > y; i--) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
            }

        }

        System.out.println();


    }


}

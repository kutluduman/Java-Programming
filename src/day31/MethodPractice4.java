package day31;

public class MethodPractice4 {


    public static void main(String[] args) {


        printOddNumbers1to100();
        System.out.println();
        countDownFrom20tillOne();
        System.out.println();
        spellName();


    }

    public static void countDownFrom20tillOne() {

        for (int i = 20; i >= 1; i--) {


            System.out.print(i + " ");

        }


    }

    public static void printOddNumbers1to100() {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 1) {


                System.out.print(i + " ");
            }

        }


    }

    public static void spellName() {


        String name = "Kutluhan";

        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i) + " ");

        }


    }

}



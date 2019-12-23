package day32;

public class CharacterActions {

    public static void main(String[] args) {

        printAtoZ();
        System.out.println();
        printZtoA();
        System.out.println();
        printAlphabetInRange('c', 'a');
        printAlphabetInRange('a', 'k');


    }

    public static void printAtoZ() {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");

        }


    }

    public static void printZtoA() {

        for (char i = 'Z'; i >= 'A'; i--) {

            System.out.print(i + " ");

        }


    }

    public static void printAlphabetInRange(char beginning, char ending) {

        if (beginning < ending) {

            //           System.out.println("We need to increment from " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <= ending; iChar++) {

                System.out.print(iChar + " ");


            }
            System.out.println();

        } else if (beginning > ending) {

            //           System.out.println("We need to decrement from " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >= ending; iChar--) {

                System.out.print(iChar + " ");

            }
            System.out.println();


        } else {

            System.out.println("They are same character");


        }


    }


}

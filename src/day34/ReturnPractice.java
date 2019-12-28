package day34;

public class ReturnPractice {

    public static void main(String[] args) {

        /**
         * what is return keyword is used for ?
         *
         * break vs return
         *
         * break ----> loop : break out of the loop
         *              switch : break out of the case
         *               can we use it to exit method? No
         *
         * return -----> inside a method
         *               return the value out of a method with return type
         *               the moment the return keyword is reached it will terminate
         *               can it be used in void method?
         *               Yes, but only in this way : return ;
         *               what is the benefit of using in void method?
         *                  to terminate the method early
         */

        printMin4CharacterLengthName("Jon");
        System.out.println();
        printMin4CharacterLengthName("Java Shark");


    }

    public static void printMin4CharacterLengthName(String name) {

        // if the name has less than 4 chars, get out of the method

        if (name.length() < 4) {

            System.out.println("Invalid Method");
            return;
        }

        System.out.println(name);

    }

}

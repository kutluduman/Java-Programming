package day17;

public class FizzBuzz {

    public static void main(String[] args) {

        // if a number can be divided by 3 and 5 ====== Fizz Buzz number
        // if a number can be divided by 5 ========== Fizz number
        // if a number can be divided by 3 ========== Buzz number



        int num = 1;
        while (num <= 100) {


            System.out.println(num);
            ++num;

            if (num % 5 == 0 && num % 3 == 0) {

                System.out.println("Fizz Buzz Number = " + num);


            } else if (num % 5 == 0) {


                System.out.println("Fizz = " + num);

            } else if (num % 3 == 0) {


                System.out.println("Buzz = " + num);


            }


        }
    }
}
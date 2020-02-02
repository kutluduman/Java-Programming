package Recap;

public class RecapArrays3 {

    public static void main(String[] args) {

        // Question 1 ;


        boolean A = true;
        boolean B = false;


        while (true) {

            if (A != !B) {  // this means that true is not equal to false opposite true so condition is false

                System.out.println("Hello Cybertek");
                break;

            } else {

                System.out.println("Hello World");
                break;

            }
        }

        // Question 2 ;

        int i = 5;

        do {
            i--;
            System.out.println(i + " "); // 4
            i++; // back to 5 so infinite loop

        } while (i > 0);


        // Question 3 ;

        int x;
        int y = 5;

        for (x = 0; x < y; x++) {

            System.out.println((x += 2) + " ");

            // 0 is less than 5 so the condition is true
            // then it goes to print and x becomes 2
            // after print it goes to the iterator and the iterator is increasing
            // so our number x became 3
            // 3 is less than 5, so condition is true
            // then it prints 3+2 = 5
            // iterator increases 5 by 1 and it becomes 6
            // since x 6 is not bigger than y 5, the condition fails
            // so the outcome is 2,5


        }


        // Question 4 ;


        int[] arr = {1, 2, 3, 4, 5};

        for (int k = 1; i < arr.length; k++) {

            System.out.println(arr[i]);

            // the index starts from 1, index 1 of the array is 2
            // it executes 2 and then there is break. so we get out of the loop

        }

        // Question 5 ;


        int a = 10;

        for (int j = 0; j <= 5; j++) { // 0,1,2,3,4,5 values of J

            a += j; // 10, 11, 13, 16, 20, 25

        }

        System.out.println(a);


        // Question 6 ;

        String str = "Java";
        String str2 = new String(str);
        int count = 10;

        do {
            count += 2;

        } while (str == str2); // false different memory

        // this would be true ; str.equals(str2);

        System.out.println(count); // do while executes one time even if the statement is wrong, thats why answer is
        // 12!


        // Question 7 ;

        String string = "  ";

        str.trim(); // string is immutable, there is 3 empty, it doesn't mean it is empty String

        int n1 = 0;

        while (str.isEmpty()) {

            n1 += 5;

            if (n1 == 20)
                break;

        }


    }
}

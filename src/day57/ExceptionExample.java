package day57;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("Hello B15 Online Friends!");

//       int num = 2.5 ; Compile Error

        int[] nums = new int[3]; // 0, 1 , 2

        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
 //       nums[3] = 200; if this is rune then below line won't be run

        System.out.println("Bye");  // this line does not run due to the runtime error

        int result = 10 / 0; // runtime error
        System.out.println(result); // runtime error

    }
}

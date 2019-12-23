package repl_it;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {

        String answer, names = "";
        boolean condition = true;


        Scanner input = new Scanner(System.in);

        while (condition) {

            System.out.println("Please enter guest name:");
            names+=(" "+input.nextLine());
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();

            if (answer.equals("no")){

                condition= false;
                System.out.println("Guest's list:"+names);


            } else {

                names+=",";
            }


        }





    }
}

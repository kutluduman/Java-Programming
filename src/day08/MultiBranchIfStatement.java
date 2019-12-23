package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {


        // given your currentSpeed, speedLimit

        // check whether the currentSpeed is more than

        // 90  ======= jail

        // more than 80 and less than 90 ------ reckless driving


        // -------- start from here ------------

        // more than 70 and less than 80 ======== points taken

        // more than 60 and less than 70 ======== warning

        // if not speeding keep driving

        int currentSpeed = 65;


        if (currentSpeed>70) {

            System.out.println("You are speeding more than 70, Points Taken");

        } else if (currentSpeed>60) {

            System.out.println("You are speeding more than 60, Warning");

        } else {

            System.out.println("Keep Driving");
        }



    }

}

package day08;

public class MultiBranchIfStatement2 {

    public static void main(String[] args) {
        // given your currentSpeed, speedLimit

        // check whether the currentSpeed is more than

        // 90  ======= jail

        // more than 80 and less than 90 ------ reckless driving

        // more than 70 and less than 80 ======== points taken

        // more than 60 and less than 70 ======== warning

        // if not speeding keep driving


        int currentSpeed = 65;

        if (currentSpeed>90) {
            System.out.println("You will be jailed");

        } else if (currentSpeed>80) {
            System.out.println("Reckless Driving");

        } else if (currentSpeed>70) {

            System.out.println("Points taken");
        } else if (currentSpeed>60) {

            System.out.println("Warning");

        } else {

            System.out.println("Keep enjoying your drive mate ! ");
        }



    }

}

package office_Hour;

public class Practice_12_27_2 {

    public static void main(String[] args) {

        System.out.println(Eligible(23));
        System.out.println(Eligible(45));


    }

    public static boolean Eligible(int age) {

        if (age >= 35) {

            return true;

        }

        return false;


    }


}

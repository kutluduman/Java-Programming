package day06;

public class CompoundOperator2 {

    public static void main(String[] args) {

        // += -= *= /= compound operator to simplify


        int studentOnline = 263 ;
        studentOnline+=5;

       // studentOnline = studentOnline + 5;

        System.out.println(" 5 people joined the class now " + studentOnline);

        studentOnline-=3;

        //studentOnline = studentOnline - 3;

        System.out.println( " 3 people left the class now " + studentOnline);

        //studentOnline = studentOnline * 2;

        studentOnline*=2;


        System.out.println(" the student count doubled " + studentOnline);

        //studentOnline = studentOnline / 3;

        studentOnline/=3;

        System.out.println("The student dropped to 1/3 " +studentOnline);




    }

}

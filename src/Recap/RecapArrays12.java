package Recap;

public class RecapArrays12 {

    public static void main(String[] args) {


        String[] days = {"sun", "mon", "wed", "sat"};
        int wd = 0; // -1, -1+1+2 =2, 2+2= 4, 4-1=3; ----> iteration and calculation

        for (int i = 0; i < days.length; i++) { // 0,1,2,3 ---- repeat 4 iteration

            switch (days[i]) { // sun, monday, wed, sat

                case "sat":
                case "sun":         // this means that or so case sat or case sun
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;

            }

        }

        System.out.println(wd);


    }

}

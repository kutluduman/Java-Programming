package office_Hour;

public class Practice_12_10 {

    public static void main(String[] args) {

        String[] cars = {"bmw", "vw", "audi"};


        System.out.println(cars[0]); // prints the first index
        System.out.println(cars[1]); // second index
        System.out.println(cars[2]); // third index

        System.out.println();


        // how to print in once
        // we use for each loop

        for (String eachCar   : cars ) {     // by this way, for each loop assigns each value from the arrays to the
                                            // variable we use for the for each loop
                                            // when there is no loop, for each loop will stop automatically


            System.out.println("I am done assigning the car " +eachCar);

            // so one by one we assign the values to our for each loop

        }


        System.out.println();

        // for loop needs to know where to start and end
        // for each loop directly assigns all the values in the array


        for (int x = 0; x <cars.length ; x++) {

            System.out.println(cars[x]);

        }






    }
}



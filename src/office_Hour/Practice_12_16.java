package office_Hour;

public class Practice_12_16 {

    public static void main(String[] args) {


        String[] names = {"John", "Kevin", "Scott"};


        System.out.println("First Name : " + names[0]); //first name will be John

        System.out.println();

        for (String eachNames : names) {

            System.out.println(eachNames);
            System.out.println();

        }

        // let's say we need to store table
        // where we have rows and columns

        String[][] students = {{"1", "John", "35","USA"},
                {"2", "Kevin", "40", "Brazil"},
                {"3", "Scott", "20","Canada"}

        };


        System.out.println("How many arrays inside students 2d array? " + students.length);
        System.out.println();

        System.out.println("How many rows in second row(inner array)? " + students[1].length);
        System.out.println();


        // loop through inner arrays
        for (String [] students2D : students) {

            for (String eachStudents1D : students2D) {

                System.out.print(eachStudents1D+ " ");



            }

            System.out.println();

        }

        System.out.println();
        // find oldest student and print his name

        // print only ages
        for (String[] row : students) {


            //go through every row and get
            // value only from 3rd column
            System.out.println(row[2]);


        }



    }
}



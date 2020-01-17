package office_Hour;

public class Practice_12_17 {

    public static void main(String[] args) {

        // data types : primitive - non-primitive

        // primitive = byte short float char int boolean double long
        // non primitive = scanner String Array

        // Primitive data types they do not have actions, or in other words methods like non primitive does

        int number = 6;

        String word = "Java! ,+";

        System.out.println(word); // java, something java has in the memory because stored

        System.out.println("word"); // this is random printing // word itself

        System.out.println(number); // 6 because we defined or stored as variable in the memory already

        System.out.println(number + 6);


        // in order to see how many chars we have in a variable

        System.out.println(word.length()); // () this shows that this is a method //8


        String book = "learn java in 1 day, java is fun";

        System.out.println("first index of j" + book.indexOf("j"));
        System.out.println("last index of j" + book.lastIndexOf("j"));

        System.out.println(book.charAt(0)); // print one char only

        System.out.println(book.charAt(5)); // print space

        String student = "Rabia";

        System.out.println(student.substring(2));


    }
}



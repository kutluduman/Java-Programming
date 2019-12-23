package day13;

public class More_String_Practice {

    public static void main(String[] args) {


        String name = "Pumkin";

        System.out.println(name);

 //       name = "Osman";

   //     System.out.println(name);

        name.toUpperCase();

        System.out.println(name);
        System.out.println(name.toUpperCase());

        // what if I really want to change the name

        name = name.toUpperCase();
        System.out.println(name); // all the other pointers and references are excluded because of new assigned String






    }


}

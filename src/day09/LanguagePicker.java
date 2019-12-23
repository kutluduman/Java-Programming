package day09;



public class LanguagePicker {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Centre! ");

        System.out.println("Dial the number to chose the language from 1-7 from below :  ");

        System.out.println("1- Hello");
        System.out.println("2- Salam");
        System.out.println("3- Hola");
        System.out.println("4- Privet");
        System.out.println("5- Merhaba");
        System.out.println("6- Szia");
        System.out.println("7- Bonjour");



        String greeting = "" + " , SDET";
        int languageOption = 5;


        if (languageOption == 1) {

            greeting = "Hello"+ " , SDET";;


        } else if (languageOption == 2) {

            greeting = "Salam" + " , SDET";

        } else if (languageOption == 3) {


            greeting = "Hola"+ " , SDET";;



        } else if (languageOption == 4) {


            greeting = "Privet"+ " , SDET";;


        } else if (languageOption==5) {


            greeting = "Merhaba"+ " , SDET";;


        } else if (languageOption==6) {

            greeting = "Szia"+ " , SDET";;

        } else if (languageOption==7) {

            greeting = "Bonjour"+ " , SDET";;

        } else {
            System.out.println("Wrong Dial ! ");
        }
        // greeting = greeting + " , SDET!"
        System.out.println(greeting);


    }

}

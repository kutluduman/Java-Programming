package day09;

public class LanguagePicker_SwitchStatement {

    public static void main(String[] args) {

        int languageCode = 9;
        String greeting = "";

        switch (languageCode) {

            case 1:
                greeting = "Hello";
                System.out.println(greeting + ", SDET");

                break;

            case 2:

                greeting = "Salam";
                System.out.println(greeting + ", SDET");

                break;

            case 3:

                greeting = "Privet";
                System.out.println(greeting + ", SDET");

            break;

            case 4:

                greeting = "Merhaba";
                System.out.println(greeting + ", SDET");

                break;

            case 5:

                greeting = "Bonjor";
                System.out.println(greeting + ", SDET");

                break;

            default:

                System.out.println("Unknown Language");



        }







    }

}

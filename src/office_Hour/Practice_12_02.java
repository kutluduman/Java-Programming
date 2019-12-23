package office_Hour;

public class Practice_12_02 {

    public static void main(String[] args) {


    String item = " Alexa (3rd Gen) ";

    // get whatever is in parenthesis to know the generation ()


        // find of index of ( and index of ), use substring to get the text

        // if you know the String and charAt() then you would :


//              System.out.println(item.substring(9,18));
//        System.out.println(item.substring(10,17));

        // But what if you do not know the charAt?


        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");

        String wordInside = item.substring(indexOfOpeningParenthesis+1, indexOfEndingParenthesis);
        System.out.println("wordInside = " + wordInside);
        
//   -----------------------------------------------------------------------------------------------------

        String letters = "J%a^V**$1a(" ;
        System.out.println("letters = " + letters);

        // remove % ^ * $ 1 (

        letters= letters.replace("%","")
                .replace("^","")
                .replace("*", "")
                .replace("$", "")
                .replace("1","")
                .replace("(","")
                .toUpperCase();


        System.out.println("letters = " + letters);

















    }
}

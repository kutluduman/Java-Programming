package day16;

public class String_Practice_GoogleSearch {

    public static void main(String[] args) {

        String keywordToSearch = "Java";
        String tabTitle = keywordToSearch + " - Google Search";


        if (tabTitle.startsWith(keywordToSearch)  && tabTitle.endsWith(" - Google Search")   ) {


            System.out.println("Test Passed");

        } else {


            System.out.println("Test Failed");
        }




    }
}

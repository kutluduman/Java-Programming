package day36;

public class MethodPractice {

    public static void main(String[] args) {


        Boolean result1 = checkIfStringHasNumber("ytz13ck");

        System.out.println(result1);

    }

    public static Boolean checkIfStringHasNumber(String str){

        for (int i = 0; i <str.length() ; i++) {


            if (Character.isDigit(str.charAt(i))) {

                return Boolean.valueOf(true);


            }
            
        }

        return Boolean.valueOf(false);
        
    }


}

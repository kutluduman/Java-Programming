package day22;

public class ArrayString {

    public static void main(String[] args) {

        // create an String array with size that you define
        // and store all your household member names


        String[] houseHoldNames = new String[4];

        houseHoldNames[0]= "John";
        houseHoldNames[1]= "Kate" ;
        houseHoldNames[2]= "Merry";
        houseHoldNames[3]= "Mick ";


        System.out.println( houseHoldNames[0]);
        System.out.println(houseHoldNames[1]);
        System.out.println(houseHoldNames[2]);
        System.out.println(houseHoldNames[3]);


        // immutable means you can not change the internal structure of the object
        // if you have String abc = "Hello"
        // if you do abc.toUppercase ---> it will create new String object "Hello"
        // and it does not change original hello at all

        // not resizeable ----> specifically for array
        // we can not change the size of array once we create them with certain size
        // However, we can change the elements inside this array
        // and it means : It is not immutable






    }

}

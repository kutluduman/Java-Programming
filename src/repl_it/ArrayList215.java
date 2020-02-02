package repl_it;

import java.util.ArrayList;

public class ArrayList215 {

    public static void main(String[] args) {





    }
    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> numbers){

        ArrayList<Integer> newArr = new ArrayList<>(numbers);

        for (int i = 0; i <numbers.size() ; i+=2) {

            newArr.add(i,newArr.get(i));


            
        }


        return newArr;

    }


}

package office_Hour.Practice_01_27;

public class FinalKeyword extends Data {

    final int a = 200;
    final static double b = 100; // you have to initialize before giving final keyword


//    @Override
//
//    public void printName(){
//                                          --------> this cannot be override because the method has final keyword
//        System.out.println("Mohammed");
//
//
//    }


    public final int printName(int a) {

        return a;

    }


    public static void main(String[] args) {

        final int num = 100; // value is constant, cannot be changed

//        num=300; ----> compiler error

        System.out.println(num);

        final String username; // you can use final keyword without initializing

        System.out.println(b);


    }


}

package office_Hour;

public class Practice_12_27 {

    public static void main(String[] args) {


        /**
         * methods = grouping series of statements together to perform a specific action
         * methods make out code more reusable(don't need to repeat same set of statements)
         * method declaration :
         *  access - modifiers  specifiers return-type name(parameters) {
         *              statements ;
         *      }
         *
         * During this course :
         *                      access modifiers =  public, protected, default, private
         *                      specifiers = static , final , abstract
         *                      return type(mandatory) = void, any other data types(primitives or non primitives)
         *                      parameter = any other data types(primitives or non primitives)
         *
         *       For now we will only use, public and static
         *
         *       if the return type is void ---> we do not accept any value in return. does not return any value
         *
         *       if the return type is not void -----> must return a value
         *                                             returning value must be matched with the return-type of
         *                                             method
         *
         *      return is also used for exiting the method
         *
         *      return statement : it's used for exiting the current method. We can also use return statement
         *                          to return a value from method
         *
         *      Methods with parameters : sometimes, method needs specific information(from the user) to perform its
         *                                  function
         *
         *              The argument that we are passing must watch the parameter's data type
         *
         *
         */


        double number1 = method3();

        System.out.println();




    }

    public static void method1() {

        System.out.println("hello batch 15");


    }

    public static void method2() {

        if (true) {

            return;
        }

        System.out.println("test completed");

    }

    public static double method3() {


        return method3();

    }


}

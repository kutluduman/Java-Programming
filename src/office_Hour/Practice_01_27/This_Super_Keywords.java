package office_Hour.Practice_01_27;

public class This_Super_Keywords {

    int a = 100;

    public void method1() {

        System.out.println(this.a);  // calls instance method
    }

    public void method2() {

        this.method1(); // calls instance method

    }


}

package office_Hour;

public class Practice_01_23 {

    static String name;
    static int stA = 10;

    int inB;

    public static void main(String[] args) {

        System.out.println(name);
        System.out.println(Practice_01_23.name);


        Practice_01_23 obj1 = new Practice_01_23();
        Practice_01_23 obj2 = new Practice_01_23();

        System.out.println(obj1.stA);//10
        System.out.println(obj2.stA);//10

        System.out.println(obj1.inB);
        System.out.println(obj2.inB);
    }


    public void method1() {

        System.out.println(name);

    }



}


package office_Hour.Practice_02_06;

public abstract class States {
    String stateName;

    public void tax() {

        System.out.println("Tax rate is 5%");

    }

    public final void method1() {

        System.out.println("method 1 from State class");

    }


}


class Kentucky extends States {

    String stateName = "KY";

    public void tax() {

        System.out.println("Tax Rate in KY is 6%");

    }

    public void KFC() {

        System.out.println("KY has KFC");

    }

    public final void method1(int a) {

        System.out.println("method 1 from Kentucky");

    }


}


class California extends States {

    String stateName = "CA";

    public void tax() {

        System.out.println("Tax Rate in California is 9%");


    }

    public void hollywood() {

        System.out.println("There is hollywood in CA");

    }

    public final void method1(int a) {

        System.out.println("method 1 from Kentucky");

    }


}
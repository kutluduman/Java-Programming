package day47;

public class ExtremeSport extends Sport {

//    @Override

//    public void doSomething() {
//
////        super.doSomething();
//
//        System.out.println("Doing extreme sport");
//
//            }
    // can not override
    //but you can do anything else
    // for example you can overload it

    public void doSomething(int x) {
        System.out.println("doing extreme sport");

    }

    @Override

    // this final keyword is
    // blocking the sub class of ExtremeSport
    // to do override of this method

//    public final void doSomethingElse() {
//
// //       super.doSomethingElse();
//        System.out.println("Doing something else in extreme sport");
//
//    }

    public void doSomethingElse() {

        //       super.doSomethingElse();
        System.out.println("Doing something else in extreme sport");

    }


}

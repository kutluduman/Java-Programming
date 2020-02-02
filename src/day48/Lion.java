package day48;

public class Lion extends Mammals {

    @Override
    public void makeNoise() {

        System.out.println("Lion roars");

    }

    @Override
    public void drinkMilk() {


    }


    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        // any class you created, it can be a data type for a variable
        // also known as reference variable




        Animal a1 = new Lion();
        a1.makeNoise();




    }
}

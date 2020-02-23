package day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);
        System.out.println("==============");

        digestBetter(f2);
        digestBetter(new Orange("sweet", "yellowish", 1));

        System.out.println("==============");

        System.out.println(getMyFavoriteFruit());
        System.out.println("==============");

        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println("B15 favorite fruit = " + x);

        System.out.println(getFavoriteByType(1));
        System.out.println(getFavoriteByType(5));

    }

    public static void displayFruit(Fruit anyFruit) {

        System.out.println("Displaying Fruit \n" + anyFruit.toString());

    }

    public static void digestBetter(Fruit anyFruit) {

        for (int i = 1; i <= 4; i++) {

            anyFruit.getDigested();
        }

    }

    public static Fruit getMyFavoriteFruit() {


        Fruit f = new Orange("cripsy", "green", 100);

        return f;

    }

    public static Fruit getFavoriteByType(int type) {

        if (type == 1) {
            return new Apple("Sweet", "blue", "Ginger");


        } else if (type == 2) {

            return new Orange("cripsy", "green", 100);
        } else {

            return null;
        }


    }


}

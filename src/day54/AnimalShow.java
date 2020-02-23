package day54;

public class AnimalShow {

    public static void main(String[] args) {

        // refer a dog object as a dog
        // it can do everything a dog can do (including Animal, IndoorPet stuff)
        Dog d1 = new Dog();



        // refer a dog object as a Animal
        // it can do only those thing Animal can do
        // only the speak method in this case
        Animal a1 = d1 ;
        a1.speak();

        // refer a dog object as a Object
        // it can do only those thing Object can do
        // for example toString, hasCode, and others

        Object o1= d1;

        //refer a dog object as a IndoorPet interface
        // it can only play

        IndoorPet p1 = d1;



    }
}

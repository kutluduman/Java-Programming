package day51;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // now this become a natural order for comparing Person object


    // modifying natural order to String
    public int compareTo(Person otherPerson) {
//
//        if (this.name.charAt(0) > otherPerson.name.charAt(0)) {
//
//            return 1;
//
//        } else if (this.name.charAt(0) == otherPerson.name.charAt(0)) {
//
//            return 0;
//
//
//        } else {
//
//            return -1;
//
//        }

        return this.name.compareTo(otherPerson.name);

    }

}

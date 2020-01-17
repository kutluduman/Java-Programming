package day39;

public class StudentCreation {


    public static void main(String[] args) {

        // how do we create an object out of template

        Student s1 = new Student();

        s1.name = "Gigi";
        s1.age = 18;
        s1.gender = 'f';

        System.out.println("s1 name = " + s1.name);


        Student s2 = new Student();
        s2.name = "Bella";
        s2.age = 24;
        s2.gender = 'f';

        s2.age = 28;

        System.out.println("s2 age = " + s2.age);


        System.out.println(s2.name + "|" + s2.age + "|"
                + s2.gender);

        // I want to save Gigi's age before I change so I still have access

        int oldAge = s1.age;

        s1.age = 22;

        System.out.println("oldAge = " + oldAge);
        System.out.println("s1 new age = " + s1.age);

        // difference of age between s1 - s2

        System.out.println((s1.age - oldAge));




    }


}

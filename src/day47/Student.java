package day47;

public class Student {


    final int studentID;
    // public final static field with initial value set
    // This type of field name always suggested to make all uppercase
    // to make it clear that this is a public static field that never change
    // other languages jas specific term called Constant for this
    // If interviewer asks how do I define constant in java?
    // you would say I will create public static final field
    public static final String SCHOOL = "Cybertek";


    public Student(int studentID) {

        this.studentID = studentID;

    }
}

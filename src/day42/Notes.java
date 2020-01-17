package day42;

public class Notes {

    public static void main(String[] args) {

        /**
         * TV
         *    attributes :
         * 	brand , isOn , currentChannel
         * 	String , boolean , int   (range from 1-50)
         *
         *    behaviours :
         *    	turnOn
         *    	turnOff
         *    	getcurrentChannel
         *    	setcurrentChannel (newChannelNumber)
         *    	moveForward
         * 	moveBackward
         * ----------------------
         * Class and Object
         *
         * Class is a template for Object
         * it can define what kind of attribute and behaviour an object should have
         *
         * attribute : -->> instance variables | fields
         * behaviour : -->> instance methods
         *
         * Object is the actual thing created out of this template
         *
         * and any object created out of same template will have the attribute and behaviours defined in the template
         *
         * Protecting the data|attribute of the object
         * we can encapsulate the instance field by making it private and provide public getters and setters
         *
         * we have 4 access modifier : public , protected , default , private
         *
         * (IGNORE protected for now until inheritance topic comes in )
         *
         * public -->> accessible anywhere
         * default -->> no access modifier
         * 		--> only within the package , also known as package private
         * private -->> only accessible within the same class
         *
         * outside of the class when we create object we can give a object any name we want , like p1, p2  or any other name
         *
         * if we want to refer the object in the template itself , we can use the keyword -->> this --> the current
         * object we are working on
         * so outside the template it would look like  :
         * 	Person p1 = new Person() ;
         * 	p1.age = 18 ;
         * 	p1.eat() ;
         *
         * inside your template it would look like  :
         * 	this.age -->> to point to the instance field age
         * 	this.name -->> to point to the instance field name
         * 	this.eat();  // optional , usually it will just work without
         *
         * public class Person{
         * 	private int age ;
         * 	private String name;
         * 	public int getAge(){
         * 		return age ; // return this.age;
         *        }
         * 	public void setAge(int age){
         * 		this.age = age ;
         *    }
         * 	public String getName(){
         * 		return name; // return this.name;
         *    }
         * 	public void setName(String name){
         * 		// BUNCH OF VALIADITON I CAN USE HERE ....
         * 		this.name = name ;
         *    }
         * 	public void eat(){
         * 		print(name + "eating") ;
         *    }
         * }
         *
         * Scanner scan = new Scanner(System.in);
         * String str = new String("abc");
         * Integer i1 = new Integer("12);
         * Integer i2 = new Integer(12);
         *
         * Computer c1 = new Computer();
         *
         * Constructor - a special method that invoked every time an object is created
         * it has same name as class
         * it does not have a return type
         *
         * When Java sees the new keyword, it allocated memory for the new object. Java also looks for a constructor
         * and calls it
         *
         * Student s1 = new Student(); ----> this calls public Student() { calls the constructor
         *
         * Default constructor ----> constructor provided by compiler is called default constructor
         *
         * default constructor is provided by compiler only if no constructor is defined in class
         *
         * a default constructor is invisible and has empty body
         *
         *
         * A class can have multiple constructor with different
         * method signature(parameter list)
         *
         * it is called constructor overloading
         *
         * we can provide only getter in a class to make the class immutable
         */


    }
}

package office_Hour.Practice_01_27;

public class Data { // you cannot extend to String class ----> because string class has final keyword

    private String password= "123456";

    public String getPassword(){

        return password;

    }

    public void setPassword(String password){

        this.password=password;

    }

    final public void printName(){

        System.out.println("Hasan");

    }

}

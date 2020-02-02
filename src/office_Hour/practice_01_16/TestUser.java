package office_Hour.practice_01_16;

public class TestUser {

    public static void main(String[] args) {


        UserInfo Alisa = new UserInfo();

        System.out.println(Alisa.getUserName());

        Alisa.setUserName("Alisa");

        System.out.println("Alisa.getUserName() = " + Alisa.getUserName());

        Alisa.setSsn("123521");
        Alisa.setPassword("s1341f");

        System.out.println(Alisa.getSsn());


        UserInfo Kamran = new UserInfo();


        System.out.println(Kamran.getUserName());
        System.out.println(Kamran.getSsn());
        System.out.println(Kamran.getPassword());


    }

}

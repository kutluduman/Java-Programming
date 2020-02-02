package office_Hour.practice_01_16;

public class UserInfo {

    private String userName;
    private String password;
    private String ssn;


    public UserInfo(){

        setUserName("Unknown");
        setSsn("000000000000");
        setPassword("12345");

    }


    public String getUserName() {

        return userName;

    }

    public void setUserName(String userName) {

        this.userName = userName;


    }

    public String getPassword() {

        return password;

    }

    public String getSsn() {

        return ssn;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public void setSsn(String ssn) {

        this.ssn = ssn;

    }

}

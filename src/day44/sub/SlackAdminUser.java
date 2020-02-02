package day44.sub;

import day44.SlackUser; // because we are in different package

public class SlackAdminUser extends SlackUser {

    int adminID;

    public SlackAdminUser(String name, String status, int adminID) {

        this.status = status;
        this.adminID = adminID;
        this.name = name;

    }

    public void sendMessageAtChannel() {

        System.out.println(name + " sending message at Channel");

    }

    public void deleteMessage() {

        System.out.println(name + " deleting message");

    }


    public void addChannel() {

        System.out.println(name + " adding channel");

    }

    public String toString() {


        return "SlackAdminUser{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SlackAdminUser user1 = new SlackAdminUser("Akbar", "Release your Horses", 101);

        user1.addChannel();
        user1.deleteMessage();
        user1.sendMessageAtChannel();
        user1.sendMessage();
        user1.addEmoji();
        user1.call();


        System.out.println("user1 = " + user1);


    }


}

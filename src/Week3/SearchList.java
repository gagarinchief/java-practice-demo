package Week3;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class SearchList {
    public static void main(String[] args) {

        User me = new User();
        me.setFirstName("Vasya");
        me.setLastName("Vasin");

        User you = new User();
        you.setFirstName("Not");
        you.setLastName("Me");

        List<User> users = new ArrayList<User>();
        users.add(me);
        users.add(you);

        User.changeCrap(you);
        System.out.println(you);


    }


}

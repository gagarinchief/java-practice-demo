package Week3;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class SearchList {
    public static void main(String[] args) {

        User me = new User();
        me.setFirstName("Vasya");
        me.setLastName("Vasin");

        User yoy = new User();
        yoy.setFirstName("Not");
        yoy.setLastName("Me");

        List<User> users = new ArrayList<User>();
        users.add(me);
        users.add(yoy);

        User search = new User();
        search.setFirstName("Not");
        search.setLastName("Me");

        User found = User.findUser(users, search);

        found.setFirstName("Sally");
        System.out.println(yoy);
//        System.out.println(User.searchList(users, yoy));

//        User.printUsers(users);

//        System.out.println(me.equals(yoy));
//        System.out.println(me.hashCode() == yoy.hashCode());

    }


}

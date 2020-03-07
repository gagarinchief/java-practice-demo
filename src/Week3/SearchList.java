package Week3;

import java.util.ArrayList;
import java.util.List;

public class SearchList {
    public static void main(String[] args) {
        User me = new User();
        me.setFirstName("Vasya");
        me.setLastName("Petya");

        User you = new User(); //local variable to the main method. Created an Object class
        you.setFirstName("Sub");
        you.setLastName("Scriber");

        List<User> users = new ArrayList<User>();
        users.add(you);
        users.add(me);

        System.out.println(users.get(1).getFullName());

//        System.out.println(user.getFullName());

//        String message = user.output();
//        System.out.println(message);
    }
}

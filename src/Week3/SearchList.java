package Week3;

import java.util.ArrayList;
import java.util.List;

public class SearchList {
    public static void main(String[] args) {
String [] firstNames = {"Vasya", "Petya", "Ghenya", "Kostya"};
String [] lastNames = {"Vasya1", "Petya1", "Ghenya1", "Kostya1"};
        List<User> users = new ArrayList<User>();

        for (int i = 0; i < firstNames.length; i++) {
            User u = new User();
            u.setFirstName(firstNames [i]);
            u.setLastName(lastNames[i]);
            users.add(u);
        }
        for (User u:users) {
            System.out.println(u.getFullName());
        }

    }
}

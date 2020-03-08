package Week3;

import java.util.List;
import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    public boolean verified = false;

    public String output() {
        return "Hi " + getFullName();
    }

    public String output(boolean nice) {
        if (nice) {
            return "nice " + getFullName();

        }
        return "not nice " + getFullName();
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public void setFirstName(String fn) {
        firstName = fn.strip().toLowerCase();
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void sayHello() {
        System.out.println("Hi! I'm a user. My name is" +
                " " + firstName + " " + lastName);

    }


    public static void printUsers(List<User> users) {
        for (User u : users
        ) {
            System.out.println(u.getFullName());

        }
    }

    public static User findUser(List<User> users, User u) {
        for (User user : users
        ) {
            if (user.equals(u)) {
                return user;
            }
        }
        return null;
    }

    public static int searchList(List<User> users, User u) {
        return searchList(users, u.getFullName());
    }

    public static int searchList(List<User> users, String firstName, String lastName) {
        return searchList(users, firstName + " " + lastName);
    }

    public static int searchList(List<User> users, String fullName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getFullName().equals(fullName)) {
                return i;
            }
        }
        return -1;
    }

    public static void changeCrap(User x) {
        x = new User();
        x.setFirstName("Changed");
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", verified=" + verified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstName.equals(user.firstName) &&
                lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

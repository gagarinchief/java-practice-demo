package Week3;

public class User {
    private String firstName;
    private String lastName;
    public boolean verified = false;

    public String output() {
        return "Hi " + firstName + " " + lastName;
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


}

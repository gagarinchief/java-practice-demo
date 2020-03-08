package Week3;

public class Student extends UserInXer {
    public boolean verified = true;
    public String major;

    public Student(String fn, String ln) { //constructor. No return type
        firstName = fn;
        lastName = ln;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi, my major is " + major + ". My name is " + firstName + lastName);
    }
}



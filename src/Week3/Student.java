package Week3;

public class Student extends UserInXer implements Talk {
    public boolean verified = true;
    public String major;

    public Student(String fn, String ln) { //constructor. No return type
//        super(fn, ln);
        firstName = fn;
        lastName = ln;
    }

    @Override
    public void sayHello() {
//        super.sayHello();
        System.out.println("Hi, my major is " + major + ". My name is " + firstName + lastName);
    }
}



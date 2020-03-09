package Week3;

public class Teacher extends UserInXer implements Talk{

    @Override
    public void sayHello() {
        System.out.println("Implemented");
    }

//    @Override
//    public void sayHello() {
//        System.out.println("I'm a teacher");
//    }
}

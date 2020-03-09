package Week3;

import java.util.ArrayList;
import java.util.List;

public class Execution {
    public static void main(String[] args) {
        Student s = new Student("Ivan", "Fuckoff"); //default Constructor w/o value
        s.sayHello();

        List<Talk> thingsThatTalk = new ArrayList<Talk>();
        thingsThatTalk.add(s);
//        System.out.println(s.firstName + " " + s.lastName);
//
//        s.major = "MUSTACHE DESIGNNNN";
//        s.firstName = "Smartie-smart";
//        s.lastName = "Vasya";
////        s.sayHello();
//
//        System.out.println(s.major);
//
//        Teacher t = new Teacher();
//        t.firstName = "Teach";
//        t.lastName = "er";
//
//        List<UserInXer> users = new ArrayList<UserInXer>();
//        users.add(s);
//        users.add(t);
//
//        for (UserInXer u: users) {
//            u.sayHello();
//        }
    }
}

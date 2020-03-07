package Week2;

@FunctionalInterface
interface displayable {
    void display(String msg);
}

@FunctionalInterface
interface Cab { // When an interface will have exactly 1 abstract method we can say it as a Functional Interface
//    void bookCab(); // -> by default public void bookCab();
//    void bookCab(String source, String destination); // -> by default public void bookCab();
    double bookCab(String source, String destination); // -> by default public void bookCab();
}
// 1.
// class UberX implements Cab{
//    public void bookCab(){
//        System.out.println("UberX Booked!! Arriving Soon!!");
//    }
//}

public class LambdaTrain implements displayable {
    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        LambdaTrain dis = new LambdaTrain();
        dis.display("Welcome to Lambda Tutorial");

//        Cab cab = new UberX(); //Polymorphic Statement
//        cab.bookCab();

        //2.
        // Anonymous class implementation
//        Cab cab = new Cab() {
//            @Override
//            public void bookCab() {
//                System.out.println("UberX Booked!! Arriving Soon!!");
//            }
//        };
//        cab.bookCab();

//        3.
//        Using a Lambda Expression -> Functional Interfaces
        Cab cab = (source, destination) -> {
            System.out.println("UberX Booked from" + source + "to " + destination +  "Arriving Soon!!");
            return 800.11;
        };
        double fare = cab.bookCab("B", "A");
        System.out.println("Fare Shall be : " + fare);
    }

}

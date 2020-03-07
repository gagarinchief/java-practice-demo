package Week2;

public class TestL6W2 {
    public static void main(String[] args) {

        try
        {
            int a = 0;
            System.out.println ("a = " + a);
            int b = 20 / a;
            System.out.println ("b = " + b);
        }

        catch(ArithmeticException e)
        {
            System.out.println ("Divide by zero error");
        }

        finally
        {
            System.out.println ("inside the finally block");
        }




//        class Test extends Exception { }
//        class Week3.Main {
//            public static void main(String args[]) {
//                try {
//                    throw new Test();
//                }
//                catch(Test t) {
//                    System.out.println(“Got the Test Exception”);
//                }
//                finally {
//                    System.out.println(“Inside finally block “);
//                }
//            }
//        }


//        try
//        {
//            System.out.println(1/0);
//        }
//        catch(Exception e)
//        {
//            System.out.println("Hello Friends");
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Welcome");
//        }


//        try
//        {
//            System.out.println(1/0);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Hello QA professionals");
//        }
//        catch(Exception e)
//        {
//            System.out.println("Welcome");
//        }



//        try
//        {
//            System.out.println(1/0);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
}

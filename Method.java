public class Method
{
    public static void main(String[] args)
    {
        add();

        int x = sum(5,6);
        System.out.println("The sum of two numbers is: "+x);
        System.out.println("Calling the method inside: "+sum(2,4));
//        By method name directly
        test();
//        By class name reference
        Method.test();

//        Calling method from another class file or program
        primitives.name();

//        Calling non static method inside the same class
        Method ns = new Method();
        ns.test2();
    }

//    No argument method
    public static void add()
    {
        int a,b;
        a=10;
        b=20;
        System.out.println("Sum of a and b is: "+(a+b));
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }

     public static void test ()
     {
         System.out.println("test program");
     }

//     Method without static and calling it in main method
    public void test2()
    {
        System.out.println("Non Static method");
    }
}

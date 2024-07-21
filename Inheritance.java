//public class test
//{
//        int c =10;
//    public static void main(String[] args) {
////        int c = 10;
////        int d = 10;
////        System.out.println(add(c,d));
//
////        can not use not-static variable in static method this is main method
////        test ob = new test();
//        System.out.println(new test().c);
//
//        System.out.println(times(6));;
//        System.out.println();
//
//    }
//
//    public static int add(int a, int b)
//    {
//        return a+b;
//    }
//
//    public static int times(int a){
//        int count = 0;
//        int c = 0;
//        while (count < a){
//        System.out.println("*");
//        count+=1;
//        }
//        return c;
//    }
//}


class parent
{
    static int a = 10;
    static int b;

    static {
        a = 20;
        b = 30;
        System.out.println("Parent calss is succesfully loaded");
    }

    static void parentMethod()
    {
        System.out.println("Parent method");
    }
}

class child extends parent
{
    static int c;
    static int d = 5;
    static {
        a= 50;
        b = 77;
        c = 34;
        d = 29;
        System.out.println("Child is succesfully loaded");
    }

    static void childMethod()
    {
        System.out.println("Child Method");
    }
}

class inheritance
{
    public static void main(String[] args) {
//        System.out.println(child.b);
//        System.out.println(child.a);
//        System.out.println(child.a);
        System.out.println(parent.a);
        System.out.println(child.c);
        System.out.println(child.a);
    }
}
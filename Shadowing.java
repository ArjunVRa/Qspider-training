public class Shadowing
{
//    Can be accessed from any of the block
    static int a = 10;

    public static void main(String[] args) {

        System.out.println(a);

//        It doesn't start shadowing
        int a;

//        After declaring the statement only the it will start shadowing
        a = 33;

        System.out.println(a);
    }
}

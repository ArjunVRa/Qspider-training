public class test
{
    public static void main(String[] args) {
//        int c = 10;
//        int d = 10;
//        System.out.println(add(c,d));

        System.out.println(times(6));;
        System.out.println();

    }

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int times(int a){
        int count = 0;
        int c = 0;
        while (count < a){
        System.out.println("*");
        count+=1;
        }
        return c;
    }
}
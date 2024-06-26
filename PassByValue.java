public class PassByValue
{
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

//        After swapping also no change has been made
        swap(a,b);
        System.out.println(a+" "+b);

    }

    public static void swap(int a,int b)
    {
        int temp = b;
        b = a;
        a = temp;

    }
}

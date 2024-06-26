import java.util.Scanner;

public class Fibo
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci series: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        for (int i=1;i<=n;i++)
        {
            int temp = b;
            b = b+a;
            a = temp;
            System.out.println( a );
        }

        System.out.println("The Fibonacci series of "+n+" is : "+a);
    }
}

import java.util.Scanner;

public class CountingNum
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        long n1 = input.nextInt();

        System.out.println("Enter the digit to find: ");
        int n2 = input.nextInt();

        int count = 0;
        while (n1 > 0)
        {
            long rem = n1 % 10;
            if (rem == n2)
            {
                count++;
            }
            n1 = n1/10;
        }

        System.out.println("The number "+n2+" occured "+ count+" times");
    }
}

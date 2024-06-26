import java.util.Scanner;

public class ReverseNum
{
    public static void main(String[] args) {

        long n2;
        long result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse: ");
        long n1 = input.nextLong();

        while (n1 > 0)
        {
            long rem = n1%10;
            n1 = n1/10;

            result = result * 10 + rem;
        }







//        for (int i = 0 ; i <= n1 ; i++)
//        {
//            result = n1%10;
//            n1 = n1/10;
//
//            result = result * 10 + n1;
//        }

        System.out.println("The reverse of the number is: " + result);
    }
}

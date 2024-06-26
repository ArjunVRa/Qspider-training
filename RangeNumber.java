import java.util.Scanner;

public class RangeNumber
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of m: ");
        int m = input.nextInt();

        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        do {
            if (m%2==0)
            {
                System.out.println(m);
            }
            m++;
        }
        while (m<=n);

        System.out.println("Thank you");
    }
}

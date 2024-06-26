import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want the root: ");

        int base = input.nextInt();

        System.out.println("Enter the power of a number: ");

        int exponent = input.nextInt();

        int pow = 1;

        for (int i =1;i<=exponent;i++)
        {
            pow = pow * base;
        }

        System.out.println(exponent+ " of a number is: "+pow);

    }
}

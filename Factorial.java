import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int n1 = input.nextInt();
        int fact = 1;

        for (int i=1;i<=n1;i++)
        {
            fact = fact*i;

            System.out.println("Factorial: "+i+" "+fact);

        }
        System.out.println("Factorial of "+n1+" is: "+fact);
    }
}

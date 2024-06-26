import java.util.Scanner;

class Neon
{
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter a Neon number: ");

        int n1 = input.nextInt();

        int squ = n1 * n1;

        int sum = 0;

        while (squ != 0)
        {
            int rem = squ % 10;

            sum = sum+rem;

            squ /= 10;


        }

        if (n1 == sum)
        System.out.println("Neon");

        else{
            System.out.println("Not a neon number");
        }
    }
}
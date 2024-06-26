import java.util.Scanner;

public class MakeMeSingle
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int n1  = input.nextInt();

        while (n1 > 9)
        {
            int rem = 0;

            while (n1 != 0)
            {
                int n2 = n1 % 10;

                rem = rem + n2;

                n1 /= 10;

            }
            n1 = rem;
        }
        System.out.println(n1);
    }
}

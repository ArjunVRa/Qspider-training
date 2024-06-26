import java.util.Scanner;

public class EvenNumberSwitch
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to check Even or Odd: ");
        int n1 = input.nextInt();

        switch (Math.abs(n1%2))
        {
            case (0):
                System.out.println(n1 + " is a even number");
                break;

            case (1):
                System.out.println(n1 + " is an odd number");
                break;

            default:
                System.out.println(n1 + " is an Negative number");
        }
    }


}

import java.util.Scanner;

class XylemPholemNumber
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the xylem and phloem number: ");
        int n1 = input.nextInt();

        int last = n1 % 10;

        n1 /= 10;

        int sum2 = 0;

        while (n1>9)
        {
            int rem = n1 % 10;
            sum2 = sum2 + rem;
            n1 /= 10;
        }

        int sum1 = last+n1;
        System.out.println(sum1 == sum2?"xylem":"pholem");



    }
}
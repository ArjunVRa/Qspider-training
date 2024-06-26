import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Armstrong Number: ");

        int n1 = input.nextInt();

        int OriginalNo = n1;

        int rem;

        int sum = 0;

        while (n1 > 0)
        {
            rem = n1 % 10;

            n1 = n1 / 10;

            sum = sum+rem*rem*rem;

        }

        if (sum == OriginalNo)
        {
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not an Armstrong Number");
    }
}











//import java.util.Scanner;
//
//public class ArmstrongNumber
//{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the Armstrong number: ");
//
//        int n1 = input.nextInt();
//
//        int sum = 0;
//
//        int rem = 0;
//
//        int expo = count(n1);
//
//        while (n1>0)
//        {
//            rem = n1%10;
//
//            sum = sum + power(rem,expo);
//            n1 /= 10;
//        }
//
////        153 = 1^3 + 5^3 + 3^3 = 153
//
//
//    }
//
//    public static int count(int n1)
//    {
//        int count = 0;
//
//        while (n1 != 0)
//        {
//            int rem = n1 / 10;
//            count++;
//            System.out.println(count);
//        }
//        return count;
//    }
//
//    public static int power(int base, int expo)
//    {
//        int pow = 1;
//        for (int i=1;i<=expo;i++)
//        {
//            pow = pow * base;
//        }
//        return pow;
//    }
//
//}

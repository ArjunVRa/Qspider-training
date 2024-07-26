//import java.util.Scanner;
//
//public class Diwali
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        int n = sc.nextInt();
//        int hrs = hrs(n);
//
//        System.out.println(p);
//        System.out.println(hrs);
//        System.out.println(diwali(p,hrs));
//
//    }
//
//    public static int hrs(int a)
//    {
//        int hrs = a/60;
//        return hrs;
//    }
//
//    public static int min(int a)
//    {
//        int min = a*60;
//        return min;
//    }
//
//    public static int diwali(int prob, int hrs)
//    {
//        int timeStart = 8;
//        int timeEnd = 12;
//        int balanceTime = timeEnd-(timeStart+hrs);
//        int balanceMin = min(balanceTime);
//        int count = 0;
//        int a = 0;
//
//        for (int i = 1; i < prob && count <= balanceMin; i++)
//        {
//            int count1 =count + i*5;
//            if (count1 < balanceMin)
//            {
//            count += i*5;
//            a++;
//            }
//        }
//
//        return a;
//    }
//}

import java.util.Scanner;

public class Diwali
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int hrsSpent = hrs(n);

        System.out.println(p);
        System.out.println(hrsSpent);
        System.out.println(diwali(p, n));

    }

    public static int hrs(int a)
    {
        int hrs = a / 60;
        return hrs;
    }

    public static int min(int a)
    {
        int min = a * 60;
        return min;
    }

    public static int diwali(int prob, int n)
    {
        int totalMinutes = 4 * 60;  // Total time available in minutes (8 AM to 12 PM)
        int balanceMinutes = totalMinutes - n;  // Remaining minutes after spending 'n' minutes
        int count = 0;  // Counter for the number of problems solved
        int totalTimeSpent = 0;

        for (int i = 1; i <= prob; i++)
        {
            int timeForProblem = i * 5;
            if (totalTimeSpent + timeForProblem <= balanceMinutes)
            {
                totalTimeSpent += timeForProblem;
                count++;
            }
            else
            {
                break;
            }
        }

        return count;
    }
}

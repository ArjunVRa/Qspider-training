//import java.util.Scanner;
//
//public class VotePolitical
//{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(vote(n, arr));
//    }
//    public static int vote(int n , int[] arr)
//    {
//        int A = 0;
//        int B = 0;
//        int C = 0;
//
//        for (int i = 0; i < arr.length; i++)
//        {
//           if (arr[i] == 1)
//           {
//               A++;
//           }
//           else if(arr[i] == 2)
//           {
//               B++;
//           } else if (arr[i] == 3)
//           {
//                C++;
//           }
//        }
//        int result = Math.max(C,Math.max(A,B));
//
//        boolean isTie = (A == result && B == result) ||
//                (A == result && C == result) ||
//                (B == result && C == result);
//
//        if (n == 1) {
//            return arr[0];
//        }
//
//        if (isTie) {
//            return -1;
//        } else if (result == A) {
//            return 1;
//        } else if (result == B) {
//            return 2;
//        } else if (result == C) {
//            return 3;
//        }
//
//        return -1;
//    }
//}
//

import java.util.Scanner;

public class VotePolitical
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(vote(n, arr));
    }

    public static int vote(int n , int[] arr)
    {
        int A = 0;
        int B = 0;
        int C = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 1)
            {
                A++;
            }
            else if(arr[i] == 2)
            {
                B++;
            }
            else if (arr[i] == 3)
            {
                C++;
            }
        }

        // Find the maximum count
        int maxCount = Math.max(C, Math.max(A, B));

        // Check for ties
        int tieCount = 0;
        if (A == maxCount) tieCount++;
        if (B == maxCount) tieCount++;
        if (C == maxCount) tieCount++;

        // If there's only one vote, that candidate is the winner
        if (n == 1) {
            return arr[0];
        }

        // If there's a tie, return -1
        if (tieCount > 1) {
            return -1;
        }

        // Otherwise, return the candidate with the maximum votes
        if (maxCount == A) {
            return 1;
        } else if (maxCount == B) {
            return 2;
        } else if (maxCount == C) {
            return 3;
        }

        return -1;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Choclate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(choc(arr));
    }
//    static int count (int n,int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 3 == 0) {
//                sum += (arr[i]) / 3;
//            } else {
//                sum += ((arr[i]) / 3) + 1;
//            }
//        }
//        return sum;
//    }
    public static int choc(int[] arr)
    {
        int A = 0, B = 0, C = 0;
        for (int i = 0; i < arr.length; i++) {
            int division = arr[i]/3;
            int rem = arr[i]%3;
            A += division;
            B += division;
            C += division;
            while (rem != 0)
            {
                A++;
                rem--;
                while (rem != 0)
                {
                    B++;
                    rem--;
                    while (rem != 0)
                    {
                        C++;
                        rem--;
                    }
                }
            }
        }

        return A;
    }

}

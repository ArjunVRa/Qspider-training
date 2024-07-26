import java.util.*;

class TestProgram
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(maxSum(n, k, arr));
        }
public static int maxSum( int n , int k , int[] arr)
{
        int count = 1, i = 0;
        int max = Integer.MIN_VALUE;

        while(i < ((n - k) + 1))
        {
            int sum = 0;
            for (int m = i; m <= i + k -1 ; m++) {
                sum+= (arr[m] * count++);
            }
            max = Math.max(sum , max);
            count = 1;
            i++;
        }

    return max;
}
}
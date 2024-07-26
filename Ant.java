import java.util.Arrays;
import java.util.Scanner;

public class Ant
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));
        System.out.println(ant(a));
    }
    public static int ant(int[] arr)
    {
        int count = 1;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
            {
                count++;
                if (count == 1)
                {
                    result++;
                }
            }
            else if(arr[i] == -1)
            {
                count--;
                if(count == 1)
                {
                    result++;
                }
            }
            else
            {
                System.out.println("value is not 1 or -1");
            }
        }
        return result;
    }


}

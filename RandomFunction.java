import java.util.Arrays;
import java.util.Scanner;

public class RandomFunction
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rand = (int) (Math.random()*100);
        System.out.println(rand);

        System.out.println("Enter the array size and it will print the array with random numbers: ");

        int a = sc.nextInt();

        int arr[] = new int[a];

        for (int i = 0; i < a; i++)
            arr[i] = (int) (Math.random() * 100);

        System.out.println(Arrays.toString(arr));
    }
}

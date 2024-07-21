import java.util.Arrays;

public class SecondHighestNumber
{

    public static void main(String[] args) {

        int[] a = {10, 5, 8, 20, 15, 12};

        int sechigh = secondHighest(a);

        System.out.println("the second highest number is : "+ sechigh);

    }

//    public static int secondHighest(int[] a)
//    {
//        if (a.length < 2)
//        {
//            throw new IllegalArgumentException("Array must have at least two elements");
//        }
//
//        Arrays.sort(a);
//
//        return a[a.length - 2];
//    }

    public static int secondHighest(int[] a)
    {

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > largest)
            {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] > secondlargest && a[i] != largest) {
                secondlargest = a[i];
            }
        }

        return secondlargest;
    }

}

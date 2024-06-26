import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Multiplication table you want to print: ");
    int n1 = input.nextInt();

    System.out.println("Enter the table you want to omit: ");
    int omit = input.nextInt();

//    int count = 0;
//    while (count<=10)
//    {
//        System.out.println(n1+"*"+count+"="+(n1*count));
//        count+=1;
//
//    }

        for (int i = 0; i <= 10; i++) {
            if (i % omit != 0) {
            System.out.println(n1+"*"+i+"="+(n1*i));

            }
        }

    }

}

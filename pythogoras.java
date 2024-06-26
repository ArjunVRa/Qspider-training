import java.util.Scanner;

import static java.lang.Math.sqrt;

class pythogoras
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base length: ");
        int base = input.nextInt();
        System.out.print("Enter the altitude length: ");
        int length = input.nextInt();

        double result = (sqrt((base*base)+(length*length)));
        System.out.println("The Hypotenus value is: "+result);
    }
}
import java.util.Scanner;

public class doWhilePrint
{
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        char n1;
        do {
            System.out.println("Welcome");
            System.out.println("Do you want to print again: ");
            System.out.println("If YES type y or n for NO: ");
            n1 = input.nextLine().charAt(0);
        }
        while (n1 == 'y' || n1 == 'Y');

        System.out.println("Thank You");

    }
}

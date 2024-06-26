import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any fruit name for switch case: ");
        String name = input.nextLine();


//        switch (name)
//        {
//            case "Mango":
//                System.out.println("Mango yellow in color");
//                break;
//
//            case "Apple":
//                System.out.println("Apple red in color");
//                break;
//
//            case "Orange":
//                System.out.println("Orange orange in color");
//                break;
//
//            case "Grapes":
//                System.out.println("Grapes green in color");
//                break;
//
//            default:
//                System.out.println("Invalid Argument!!");
//        }

        switch (name) {
            case "Mango" -> System.out.println("Mango yellow in color");
            case "Apple" -> System.out.println("Apple red in color");
            case "Orange" -> System.out.println("Orange orange in color");
            case "Grapes" -> System.out.println("Grapes green in color");
            default -> System.out.println("Invalid Argument!!");
        }

    }
}

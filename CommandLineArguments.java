public class CommandLineArguments
{

//    this program is to pass input in the command prompt itself while compiling the program itself
    public static void main(String[] args) {
        System.out.println("Entering the Main method");

        if (args.length > 0)
        {
            System.out.println("The value that is entered is: ");

            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }

        else
        {
            System.out.println("Nothing is entered while executing the program.");
        }
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class primitives
{
    public static void main(String[] args) {

//        Taking input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name:");
        String name = input.nextLine();
        System.out.println("Hello: "+name);

//sum of two numbers
        System.out.print("Enter number 1:");
        int n1 = input.nextInt();
        System.out.print("Enter number 2:");
        int n2 = input.nextInt();

        int sum = n1+n2;

        System.out.println("sum of two number is: " + sum);

//        Type casting converting from one datatype to another datatype Eg.Float to int

        System.out.print("Enter a integer:");
        float number1 = input.nextFloat();
        System.out.println("Converted to float: "+number1);

//      Manual conversion
        System.out.println("Enter a Float number: ");
        float n3 = input.nextFloat();
        System.out.println("Before converting: "+n3);
        int n4 = (int) n3;
        System.out.println("After converting: "+n4);

        System.out.println("வணக்கம்");

        float num = 123.5343434686f;
        System.out.println(num);

//        if statment

        System.out.print("Enter the value 5:");
        int number2 = input.nextInt();
        if (number2 == 5)
            System.out.println("It is an integer");
        else
            System.out.println("It is not an integer");

//        While loop

        int count = 0;
        System.out.println("While loop Enter the number to print: ");
        int number3 = input.nextInt();
        while (count != number3)
        {
            System.out.println(count);
            count++;
        }

//        For loop
        System.out.println("For loop Enter the number to print: ");
        int n5 = input.nextInt();
        for (int n6 = 0; n6 != n5 ; n6++)
        {
            System.out.println(n6);
        }

//        If else multiple
        System.out.println("Enter the salary: ");
        int salary = input.nextInt();

        if (salary<=10000)
        {
            System.out.println("New salary incremented by 2000: "+(salary+=2000));
        } else if (salary <= 20000) {
            System.out.println("New salary incremented by 3000: "+(salary+=3000));
        }
        else {
            System.out.println("Salary remains the same: "+salary);
        }

//        Do While loop
        int n7 = 2;
        do {
            System.out.println("Do while loop is executed");
        }while (n7 != 2);
    }
    //        To use static method in a different class in another program
    public static void name ()
    {
        System.out.println("Method from another program");
    }
}
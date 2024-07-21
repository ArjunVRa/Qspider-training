import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number for pattern");

        int n1 = input.nextInt();

        Pattern1(n1);
        System.out.println();
        Pattern2(n1);
        System.out.println();
        Pattern3(n1);
        System.out.println();
        Pattern4(n1);
        System.out.println();
        Pattern5(n1);
        System.out.println();
        Pattern6(n1);
        System.out.println();
        Pattern7(n1);
        System.out.println();
        Pattern8(n1);

//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < n1; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < n1; i++) {
//            if (i == 1) {
//            for (int j = 0; j < n1; j++) {
//                if (j == 1) {
//                    System.out.print(" * ");
//                }
//            }
//            }
//        }

//        for (int i = 1; i <= n1; i++) {
//            for (int j = 1; j <= n1; j++) {
//                if (j == 1 || j == n1 || i == 1 || i == n1 || i == j || i + j == n1 + 1)
//                {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println( );
//        }

//        for (int i = 1; i <= n1 ; i++) {
//            for (int j = 1; j < n1; j++) {
//                if (i >= j) {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//                System.out.println();
//            }
//        }
    }
    static void Pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void Pattern2(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n)
    {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    
    static void Pattern5(int n)
    {
        for (int i = 0; i < 2*n; i++) {
            int totalCloumn = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalCloumn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n)
    {
        for (int i = 0; i < 2*n; i++) {
            int totalCloumn = i > n ? 2 * n - i : i;
            int noOfSpaces = n - totalCloumn;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalCloumn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n)
    {
        for (int i = 0; i <= n; i++) {

            for (int space = 0; space < n-i; space++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void Pattern8(int n)
    {
        int original = n;
        n = n * 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = original - Math.min(Math.min(i,j), Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

}

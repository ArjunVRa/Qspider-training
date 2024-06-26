import java.util.Scanner;

public class Qbee1 {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String maxName = "";
        String minName = "";

        while (true) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int age = sc.nextInt();

            if (age == 0) {
                break;
            }

            if (age > max) {
                max = age;
                maxName = name;
            }
            if (age < min) {
                min = age;
                minName = name;
            }

            System.out.println("Youngest:" + minName + " " + min + ", Oldest:" + maxName + " " + max);
        }
    }
}
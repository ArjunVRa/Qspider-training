import java.util.Scanner;

public class UppercaseWithoutKeyword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1="";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='A' && c<='Z') {
                s1 += (char) (c + 32);
            } else if (c>='a' && c<='z') {
                s1+=(char)(c-32);
            }
        }
        System.out.println(s1);
    }
}

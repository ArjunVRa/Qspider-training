import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        double res = Temperature(35.1);
        System.out.println("Farehnite value is: "+ res + "F");
    }

    public static double Temperature(double celcius)
    {
        double f = ((9/5*celcius)+32);
        return f;
    }
}
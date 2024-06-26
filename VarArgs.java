import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs
{
    public static void main(String[] args) {
        single(1,2,2,35,5,6);
        multi(10,20,23,432,34);
    }

    public static void multi(long a, long b, long ...v)
    {
        System.out.println(Arrays.toString(v));
    }

//    Single type Arguments
    public static void single (long ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}

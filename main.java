public class Main{

    public static void main(String [] args){
        
        String Name = "Arjun";
        String Roll_no = "2021PECCS367";
        int Age = 20;
        // Integer x = 5;
        Integer y = 5;
        float Height = 6.1f;
        int Marks = 570;
        boolean Backlogs = false;

        // String x =10+20+"Hello"+10;
        System.out.println("Hello"=="Hello");

        System.out.println(10+'a');
        System.out.println(Name);
        System.out.println(Roll_no);
        System.out.println(Age);
        System.out.println(Height);
        System.out.println(Marks);
        System.out.println(Backlogs);
        // System.out.println(x==y);
        // System.out.println(x.equals(y));
        int a = 10;
        int b = 20;
        byte c =10+20;
        System.out.println(c);
        System.out.println(Byte.MAX_VALUE);

        int age = 70;
        String m = ((age>18 && age<50) ? "eligble":"noteligble");
        System.out.println(m);

        int d = 50;
        System.out.println(a>b?(a>d?"a":"d"):(b>d?"b":"d"));

        a++;
        System.out.println(a);


    }
}   
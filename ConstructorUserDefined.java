class Book2
{

    String title;

    Book2(String a)
    {
        title = a;
    }

}


class Book3
{

    String title;

    Book3(String title)
    {
//        This keyword has the address of the object address
        this.title = title;
    }

}

//Parametrized Method
public class ConstructorUserDefined
{
    public static void main(String[] args) {
        Book2 n1 = new Book2("Mathematics");

        Book3 n2 =  new Book3("Science");

        System.out.println(n1.title);
        System.out.println(n2.title);
    }
}

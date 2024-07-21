public class superCallStatement
{

    public static void main(String[] args) {

        Student n1 = new Student(10, "Arjun");

        System.out.println("ID : "+n1.sid);

        System.out.println("Name : "+n1.name);
    }

    public static class Student extends Person
    {

        int sid;

        Student()
        {

        }

        Student(int sid, String name)
        {
            super(name);
            this.sid = sid;
        }

    }
}

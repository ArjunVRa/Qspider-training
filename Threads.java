class A extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
        System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Threads
{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(1);

        obj1.start();
        obj2.start();
    }

}

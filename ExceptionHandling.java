public class ExceptionHandling
{
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int[] arr = new int[5];
        String string = null;

        try {
            b = a / b;
            if (b == 0) {
                throw new ArithmeticException("Can not be divided by zero: ");
            }
            int len = arr[5];
            System.out.println(string.length());
        } catch (ArithmeticException e) {
            b = 10 / 2;
            System.out.println("This is the default output : " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This is not a valid index number " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println("Bye");
    }
}

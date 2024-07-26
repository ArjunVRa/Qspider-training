public class StrBuffer
{
    public static void main(String[] args) {

//        String Buffer is used because String is immutable which means it can not be changed.
//        But in String Buffer the String can be changed

        StringBuffer a = new StringBuffer("Arjun");
        System.out.println(a.length());
        System.out.println(a.append(" V RA"));
        System.out.println(a.charAt(2));
        System.out.println(a.isEmpty());
        System.out.println(a.reverse());
        System.out.println(a.reverse());

        String result1 = a.toString();
        System.out.println("It is type casted to String Buffer to String type: "+ result1);

    }
}

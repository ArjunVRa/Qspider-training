import java.io.*;

public class FileHandling
{
    public static void main(String[] args) {

        File s1 = new File("D:\\Java training\\File_Handle\\test.txt");

//        To create a Folder in the above specified path
//        System.out.println(s1.mkdir());

//        To create a file
        boolean res = false;
        try {
            res = s1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(res);

//        To write inside a file
        try {
            FileWriter f2 = new FileWriter("D:\\Java training\\File_Handle");
            f2.write("this is an new program");
            f2.flush();
            f2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


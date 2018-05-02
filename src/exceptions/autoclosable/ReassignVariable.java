package exceptions.autoclosable;

import java.io.*;

public class ReassignVariable {

    public static void copy(String from , String to) {
/*
        InputStream is = null;
        try (is = new FileInputStream(from)     !!! The type of the resource must be specified in the "try" itself.
*/

       try (InputStream is = new FileInputStream(from);
             OutputStream os = new FileOutputStream(to);) {
//            if (os == null) os = new FileOutputStream("c:/default.txt");     !!! value in try block is "final"
            byte[] buffer = new byte[1024];
            int bytesRead = 0;

            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and write bytes " + bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copy("c:\\1.txt", "c:\\2.txt");
    }
}

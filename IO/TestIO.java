

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class TestIO {

    public static void main(String[] args) throws Exception{
        /*PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(new FileOutputStream("stuff.txt"));
        }catch (FileNotFoundException e)
        {
            System.out.println("Error opening the file stuff.txt");
            System.exit(0);
        }
        System.out.println("Writing to file");
*/

        PrintWriter outputStream = new PrintWriter(new FileOutputStream("aaa.txt",true));  
        outputStream.println("The quick brown fox");
        outputStream.println("jumped over the lazy dog.");

        outputStream.close();
        System.out.println("End of program");
    }
}
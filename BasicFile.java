import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;




public class BasicFile {

    // Short hand for System.out
    public static void out(Object s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String name;
        int age; 
        String nameFile= "";
        Scanner c = new Scanner(System.in);

        boolean error = false;
        do {
            error = false;
            try {
                out("Name text file: ");
                nameFile = c.nextLine();
                
                File file = new File(nameFile+".txt");

                out("Enter your name: ");
                name = c.nextLine();
                
                out("Enter your age: ");
                age = c.nextInt();
                
                
               PrintWriter output = new PrintWriter(file);
               output.println(name);
               output.println(age);
               output.close();
    
            } catch (Exception e) {
                out("Please either put in an integer or String");
               error = true;
            }
        } while(error);
        


        out("Program Ends");

    }
}









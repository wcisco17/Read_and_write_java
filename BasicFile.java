import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;




public class BasicFile  {

    // Short hand for System.out
    public static void out(Object s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String name;
        int age; 
        String nameFile= "";
        String userInput;
        boolean error = false;
        Scanner c = new Scanner(System.in);

        out("Name text file: ");
        nameFile = c.nextLine();
        
        File file = new File(nameFile+".txt");

        out("Would you like to read or write? ");

        userInput = c.nextLine();

        
        
        if (userInput.contains("w")) {
        do {
            error = false;
            try {
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
        
    } else if (userInput.contains("r")) {
            try {
                Scanner in = new Scanner(file);
                name = in.nextLine();
                age = in.nextInt();
                out("File Content \n" + "Name: " + name + "\nAge: " + age);
                in.close();
            } catch (Exception e) {
                out("File not found");
            }
    }

        out("Program Ends");

    }
}


import javax.swing.JOptionPane;

public class BasicFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        // Write to File
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("John Doe");
            output.println(23);
            output.close();
        } catch (IOException ex) {
            System.out.printf("Error: %s\n", ex);
        }


        // Read to file
        try {
            Scanner in = new Scanner(file);
            String name = in.nextLine();
            int age = in.nextInt();
            in.close();
        
            System.out.printf("Name: %s Age: %d\n", name, age);

        } catch (FileNotFoundException ex) {
            System.out.printf("Error: %s\n", ex);
        }
    }
}






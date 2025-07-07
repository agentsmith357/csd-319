
/*
 * Date: Jul 6, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 9
 */


import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Random;

public class module_9_file_reader {
    public static void main(String[] args) {
        
        try {
            
            // creates the file
            File file = new File("data.file");            
            boolean append = file.exists();          
            FileWriter writer = new FileWriter(file, true);
            
            // create 10 random numbers
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100); 
                writer.write(number + " "); // separating the numbers by spaces
            }
            writer.close();
            
            

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        
    }
}
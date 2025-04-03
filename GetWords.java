import java.io.*;
import java.util.*;

public class GetWords {
    // This code reads a file named "british_slang.txt" line by line and prints each line to the console.
// It handles exceptions for file not found and IO errors.

        public static void main(String[] args) {
            String filename = "WordBank.txt";
            
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                //String line;
             //   while ((line = reader.readLine()) != null) {
                    //System.out.println(line);
              //  }
                
           
            } catch (FileNotFoundException e) {
                System.out.println("Error: The file '" + filename + "' was not found.");
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
            return (String[] words = reader.lines().toArray(String[]::new));
        }
    }
    

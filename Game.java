import java.io.*;
import java.security.Key;
import java.util.*;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements Runnable, KeyListener {
    // This code reads a file named "british_slang.txt" line by line and prints each line to the console.
// It handles exceptions for file not found and IO errors.
     private ArrayList<String> words =setWordList(); // List to store words from the file
      
     public ArrayList<String> setWordList() {
        ArrayList<String> temp = new ArrayList<String>(); // List to store words from the file
       File WordBank = new File("WordBank.txt");
        try {
            Scanner scanner = new Scanner(WordBank); // Scanner to read the file
            while (scanner.hasNextLine()) {
               temp.add(scanner.nextLine()); // Add each line to the list
            }
            } catch (FileNotFoundException e) {
              e.printStackTrace(); // Print the stack trace if the file is not founder
            }
            return temp; // Return the list of words
    }


    // Constructor for the Game class
    public Game() {
        // TODO Auto-generated constructor stub
    }

    // Main method to run the game
    public static void main(String[] args) {    
        // TODO Auto-generated method stub   
    }

    
        @Override
        public void run() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'run'");
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
        }
    }
    

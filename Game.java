import java.io.*;
import java.security.Key;
import java.util.*;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements Runnable, KeyListener {
    private BufferedImage back; // Buffered image for double buffering
    // This code reads a file named "british_slang.txt" line by line and prints each line to the console.
// It handles exceptions for file not found and IO errors.
     private ArrayList<String> words =setWordList(); // List to store words from the file
    
         // Main method to run the game
    public static void main(String[] args) {    
        // TODO Auto-generated method stub   
    }


     public Game() {
        // Set up the game panel and add key listener
        new Thread(this).start();; // Create a new thread for the game`
        this.addKeyListener(null);
        setFocusable(true); // Make the panel focusable to receive key events
        addKeyListener(this); // Add key listener to the panel
    }

     
     @Override
     public void run() {
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'run'");
     }

     public void paint(Graphics g) {
        // TODO Auto-generated method stub  
        Graphics twoDgraph = (Graphics2D) g; // Create a 2D graphics object
        if(back == null){
            back = (BufferedImage) createImage(getWidth(), getHeight()); // Create a buffered image for double buffering
        }
        Graphics2D g2d = (Graphics2D) back.getGraphics(); // Get graphics from the buffered image

        g2d.clearRect(0, 0, (int) getSize().getWidth(), (int) getSize().getHeight()); // Clear the buffered image
        g2d.setFont(new Font("Arial", Font.PLAIN, 20)); // Set font for the graphics



        g2d.drawString("Welcome to the game!", 50, 50); // Draw a welcome message on the buffered image
     
        
        twoDgraph.drawImage(back, 0, 0, null); // Draw the buffered image on the panel
     }

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

    // Constructor to initialize the game
  
    



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
    

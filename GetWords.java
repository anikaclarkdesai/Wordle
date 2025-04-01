import java.io.*;
import java.util.*;

public class GetWords {
    public static void main(String[] args) {
        String filePath = "WordBank.txt"; // Change to your actual file path
        Set<String> britishWords = new HashSet<>();

        // Read British slang words from the txt file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 2); // Split at the first comma
                if (parts.length == 2) {
                    britishWords.add(parts[0].trim().toLowerCase());  // Add only the British word
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Start Wordle game with British words as the word bank
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to British Slang Wordle!");
        System.out.println("Try to guess the British slang word:");

        int attempts = 6; // Max attempts in Wordle

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine().trim().toLowerCase();

            // Validate guess
            if (britishWords.contains(guess)) {
                if (guess.equals(correctWord)) {
                    System.out.println("Congratulations! You've guessed the word!");
                    break;
                } else {
                    System.out.println("Wrong guess, try again.");
                    attempts--;
                }
            } else {
                System.out.println("Invalid word! Please guess a valid British slang word.");
            }

            if (attempts == 0) {
                System.out.println("Game over! The correct word was: " + correctWord);
            }
        }

        scanner.close();
    }
}

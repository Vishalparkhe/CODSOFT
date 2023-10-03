
package wordcounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

 class WordCounterdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text or provide the file path: ");
        String userInput = scanner.nextLine();
        
        String text;
        
        // Check if user input is a file path
        File file = new File(userInput);
        if(file.exists()){
            try {
                text = readFile(file);
            } catch (FileNotFoundException e) {
                System.out.println("Error: Unable to read the file.");
                return;
            }
        } else {
            text = userInput;
        }
        
        // Split string into an array of words using space/punctuation as delimiters
        String[] words = text.split("\\s+|(?=\\p{Punct})|(?<=\\p{Punct})");
        
        // Count the number of words
        int wordCount = words.length;
        
        System.out.println("Total count of words: " + wordCount);
        
        // Further enhancements can be added here, such as ignoring common words, providing statistics, or implementing a GUI.
    }
 }
    // Helper method to read file content
    private static String readFile(File file) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()){
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        
        return content.toString();
    }
    
 





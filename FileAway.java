import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public final class FileAway {

public static void main(String[] args) throws IOException {
    //counters for characters, words and line
    int charsCount = 0;
    int wordsCount = 0;
    int linesCount = 0; 
    //file naame variable 
    String fileName = null;
    
    Scanner fileScanner = null;
    File selectedFile = null;
    JFileChooser chooser = new JFileChooser();
    // choose file 
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        selectedFile = chooser.getSelectedFile();
        fileScanner = new Scanner(selectedFile); 
        fileName = chooser.getSelectedFile().getName();
       
    }

    while (fileScanner.hasNextLine()) {
      linesCount++;
      String line = fileScanner.nextLine();
      Scanner lineScanner = new Scanner(line);
      // count the characters of the file till the end
      while(lineScanner.hasNext()) {
        wordsCount++;
        String word = lineScanner.next();
        charsCount += word.length();
      } 

    lineScanner.close();
  }

  //displays the file name, count of characters, words, and lines
  System.out.println("Name of file: " + fileName);
  System.out.println("# of chars: " + charsCount);
  System.out.println("# of words: " + wordsCount);
  System.out.println("# of lines: " + linesCount);

  fileScanner.close();
 }
}
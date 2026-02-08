package edu.grinnell.csc207.speedreader;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * A WordGenerator reads words from a file one at a time.
 * It also keeps track of how many words and sentences
 * have been produced so far.
 */
public class WordGenerator {

    private Scanner scanner;
    private int wordCount;
    private int sentenceCount;

    /**
     * Creates a WordGenerator that reads from the given file.
     * 
     * @param filename the name of the file to read
     * @throws IOException if the file cannot be opened
     */
    public WordGenerator(String filename) throws IOException {
        scanner = new Scanner(new File(filename));
        wordCount = 0;
        sentenceCount = 0;
    }

    /**
     * Returns true if there are more words to read.
     * 
     * @return true if another word exists, false otherwise
     */
    public boolean hasNext() {
        return scanner.hasNext();
    }

    /**
     * Returns the next word from the file.
     * Increments the word count and updates the sentence count
     * if the word ends with '.', '!', or '?'.
     * 
     * @return the next word
     */
    public String next() {
        String word = scanner.next();
        wordCount++;
        if (word.endsWith(".") || word.endsWith("!") || word.endsWith("?")) {
            sentenceCount++;
        }
        return word;
    }

    /**
     * Returns the number of words read so far.
     * 
     * @return the word count
     */
    public int getWordCount() {
        return wordCount;
    }

    /**
     * Returns the number of sentences read so far.
     * 
     * @return the sentence count
     */
    public int getSentenceCount() {
        return sentenceCount;
    }
}
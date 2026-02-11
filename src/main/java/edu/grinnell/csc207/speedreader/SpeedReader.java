package edu.grinnell.csc207.speedreader;

import java.io.File;
import java.io.IOException;
import java.awt.*;

/**
 * SpeedReader displays text from a file one word at a time
 * using RSVP.
 * 
 * This program reads words using WordGenerator and
 * renders them to a DrawingPanel at a specified
 * words-per-minute speed.
 */
public class SpeedReader {

    /**
     * Runs the SpeedReader.
     * Command line argument: <filename> <width> <height> <font size> <wpm>.
     * Displays words from the file at the given speed.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName = args[0];
        // Path pathFile = Paths.get(args[0]);
        if (args.length != 5) {
            System.out.println("The argument number is wrong.");
            System.exit(0);
        }

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("The file does not exist.");
            System.exit(0);
        }

        int width = Integer.parseInt(args[1]);
        int height = Integer.parseInt(args[2]);
        int fontSize = Integer.parseInt(args[3]);
        int wpm = Integer.parseInt(args[4]);

        // converting to miliseconds
        int delay = 60000 / wpm;

        if (width < 0 || height < 0 || fontSize < 0 || wpm < 0) {
            System.out.println("This should be a positive integer");
            System.exit(0);
        }

        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
        Font f = new Font("Courier", Font.BOLD, fontSize);
        g.setFont(f);
        WordGenerator generator = new WordGenerator(fileName);

        while (generator.hasNext()) {
            String word = generator.next();
            panel.clear();
            g.drawString(word, width / 2, height / 2);
            Thread.sleep(delay);
        }
    }
}
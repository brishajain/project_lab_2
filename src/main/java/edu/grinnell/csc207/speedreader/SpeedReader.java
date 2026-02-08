package edu.grinnell.csc207.speedreader;

/** TODO: implement this class and add a doc comment! */
public class SpeedReader {

    /** TODO: implement me and add an appropriate doc comment! 
     * !! Add the error checking for valid file name!!
    */
    public static void main(String[] args) {
        // String fileRead = args[0];
        // Path pathFile = Paths.get(args[0]);
        if(args.length!=6){
            System.out.println("The argument number is wrong.");
            System.exit(0);
        }
       /* if (args[0] != fileExist.exists()) {
            System.out.println("The file does not exist.");
            System.exit(0);
        } */
        for (int i = 1; i < args.length; i++) {
            int changeInt = Integer.parseInt(args[i]);
            if (changeInt < 0) {
                System.out.println("This should be a positive integer");
                System.exit(0);
            }
        }
        
        WordGenerator WG = new WordGenerator();
        while(WG.hasNext()){

        }
    }
}
package runner.lib.Server;
    
import java.io.*;

public class Files {
    
    /** 
     * @return Boolean
     */
    public static Boolean Checks() {
        boolean publicOut, guessOut, ideaOut;
        File guess = new File("./runner/lib/outputs/Guess.java");
        File idea = new File("./runner/lib/outputs/Idea.java");

        if(guess.canRead()) {
            guessOut = true;
        } else {
            guessOut = false;
        }
        if (idea.canRead()) {
            ideaOut = true;
        } else {
            ideaOut = false;
        }

        if(guessOut && ideaOut == true) {
            publicOut = true;
        } else {
            publicOut = false;
        }

        return publicOut;
    }
}
package runner;

import runner.lib.*;
import runner.lib.Server.ChangeTitle;

public class Main {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Java Game Selector!");
        Lib.Checks();
        ChangeTitle.Yoink();
    }

}
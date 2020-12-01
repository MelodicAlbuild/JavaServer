package runner.lib;

import java.io.*;
import java.net.URL;

import runner.lib.Server.Files;

public class Lib {
    public Lib() {
        Checks();
    }

    public static void Gather() {
        try (BufferedInputStream in = new BufferedInputStream(
                new URL("https://3000-a22446fc-9d75-4b91-a453-443127909d7d.ws-us02.gitpod.io/downloads/Guess.java")
                        .openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(
                        "/workspace/JavaServer/runner/lib/outputs/Guess.java")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedInputStream in2 = new BufferedInputStream(
                new URL("https://3000-a22446fc-9d75-4b91-a453-443127909d7d.ws-us02.gitpod.io/downloads/Idea.java")
                        .openStream());
                FileOutputStream fileOutputStream2 = new FileOutputStream(
                        "/workspace/JavaServer/runner/lib/outputs/Idea.java")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in2.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream2.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void Checks() {
        Gather();
        if(Files.Checks() == true) {
            System.out.println("Checks returned True");
        } else {
            System.out.println("Checks returned False");
        }
    }
}
package runner;
import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        try (BufferedInputStream in = new BufferedInputStream(
                new URL("https://3000-a8f385c0-c266-452d-889a-10ab53a1ac51.ws-us02.gitpod.io/downloads/Guess.jar")
                        .openStream());
                FileOutputStream fileOutputStream = new FileOutputStream("/workspace/JavaServer/runner/lib/outputs/Guess.jar")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedInputStream in2 = new BufferedInputStream(
                new URL("https://3000-a8f385c0-c266-452d-889a-10ab53a1ac51.ws-us02.gitpod.io/downloads/Idea.jar")
                        .openStream());
                FileOutputStream fileOutputStream2 = new FileOutputStream(
                        "/workspace/JavaServer/runner/lib/outputs/Idea.jar")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in2.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream2.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
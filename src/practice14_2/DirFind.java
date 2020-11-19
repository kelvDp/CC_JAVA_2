package practice14_2;

// import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class DirFind {

    public static void main(String[] args) {

        try (Stream<Path> files = Files.find(Paths.get("."), 5, (p, a) -> a.isDirectory())) {

            System.out.println("\n=== Find all dirs ===");
            // Print out directory list here
            files.forEach(line -> System.out.println(line));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

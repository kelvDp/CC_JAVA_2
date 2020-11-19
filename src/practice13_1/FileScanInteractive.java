package practice13_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } // try-with-resources will close the connections
        return instanceCount;
    }

    public static void main(String[] args) {
        // Your code goes here

        if (args.length < 1) {
            System.out.println("There are no available arguments passed in.");
            System.exit(-1);
        }

        String firstArg = args[0];
        FileScanInteractive fsi = new FileScanInteractive();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String searchItem = "";
            while (true) {
                System.out.println("Enter search string or q to exit: ");
                searchItem = reader.readLine().trim();
                
                if (searchItem.trim().equalsIgnoreCase("q")) {
                    break;
                }

                int count = fsi.countTokens(firstArg, searchItem);
                System.out.println("The search token appeared " + count + " times in the file");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
}
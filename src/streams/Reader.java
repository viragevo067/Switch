package streams;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test1");
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
    }
}

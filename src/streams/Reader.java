package streams;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        String testt = null;
        File f = new File(testt);

        Scanner sc = new Scanner(testt);
        sc.nextLine();

        sc.close();
    }
}

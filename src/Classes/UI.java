package Classes;
import java.util.Scanner;

public class UI {
    private static final Scanner reader = new Scanner(System.in);

    public static String readString() {
        return reader.nextLine();
    }

    public static int readInt() {
        return Integer.valueOf(reader.nextLine());
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        try {
            var name = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
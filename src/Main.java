import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert equalization");
        String equ = reader.readLine();

        Checking check = new Checking();
        check.checkStr(equ);

    }
}

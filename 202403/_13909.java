import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long input = Long.parseLong(br.readLine());
        System.out.println((int)Math.sqrt(input));
    }
}
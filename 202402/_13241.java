import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int A = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long answer=0;
        answer=GCD(B,A);
        System.out.println(A*B/answer);
    }
    public static long GCD(long b,long a){
        if(a==0)
            return b;
        return GCD(a,b%a);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        long M=Long.parseLong(st.nextToken());
        long N=Long.parseLong(st.nextToken());
        for(long i=M;i<=N;i++){
            if(Prime(i))
                System.out.println(i);
        }
    }
    public static boolean Prime(long a){
        if(a==0||a==1)
            return false;
            for(long i=2;i<=Math.sqrt(a);i++){
                if(a%i==0)
                    return false;
            }
            return true;
    }
}
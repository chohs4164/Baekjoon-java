import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();

            StringTokenizer st = new StringTokenizer(input, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int gcdValue = 0;
            gcdValue = GCD(A, B);
            System.out.println(A*B/gcdValue);
        }
    }
    //최대공약수 구하기
    public static int GCD(int a, int b) {
        if(b>a){
            int tmp=a;
            a=b;
            b=tmp;
        }
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
}
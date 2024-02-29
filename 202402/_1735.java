import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        StringTokenizer st = new StringTokenizer(input1);
        int a1=Integer.parseInt(st.nextToken()); //분자1
        int b1=Integer.parseInt(st.nextToken()); //분모1
        String input2 = br.readLine();
        st=new StringTokenizer(input2);
        int a2=Integer.parseInt(st.nextToken()); //분자2
        int b2=Integer.parseInt(st.nextToken()); //분모2
        int b3=b1*b2/GCD(b1,b2);
        int tmp1=b3/b1;
        int tmp2=b3/b2;
        a1*=tmp1;
        a2*=tmp2;
        int a3=a1+a2;
        int gcd=GCD(a3,b3);
        a3/=gcd;
        b3/=gcd;
        System.out.println(a3+" "+b3);
    }
    public static int GCD(int a,int b){
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
}
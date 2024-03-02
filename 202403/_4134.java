import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4134 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            long n=Long.parseLong(br.readLine());
            long answer=Prime(n);
            System.out.println(answer);
        }
    }
    public static long Prime(long n){
        if(n<=1) //1이하의 수는 2로 정의하는 것이 매우매우 중요하다.
            return 2;
        //n보다 크거나 같은 소수 중 가장 작은 소수
        boolean flag; //소수이면 true 아니면 false;
        while(true) {
            flag=true;
            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { //나누어지면 소수가 아니므로
                    flag = false;
                    break;
                }
            }
            if(flag)
                return n;
            n++;
        }
    }
}
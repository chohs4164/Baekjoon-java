import java.util.ArrayList;
import java.util.Scanner;

public class _11653 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <Integer> a =new ArrayList<Integer>();
        int N,count=0;
        N=scanner.nextInt();
        boolean [] isPrime = new boolean[N+1];
        for(int i=2;i<=N;i++){ //모두 소수로 초기화
            isPrime[i]=true;
        }
        for(int j=2;j*j<=N;j++) {
            if (isPrime[j]) {
                for (int k = j * j; k <= N; k += j) {
                    isPrime[k] = false;
                }
            }
        }
        for(int l=2;l<=N;l++){
            if(isPrime[l]) //소수이면
                a.add(l); //List에 저장
        }
        for(int m=0;m<a.size();m++){
            if(N%a.get(m)==0) {
                System.out.println(a.get(m));
                N/=a.get(m);
                m--;
            }
        }
    }
}
import java.util.Scanner;

public class _17103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();

        boolean [] isPrime=new boolean[1000001];
        isPrime[0]=false;
        isPrime[1]=false;
        for(long i=2;i<=1000000;i++){
            isPrime[(int)i]=true;
        }
        for(long i=2;i<=1000000;i++){
            //에라토스테네스의 체
            if(isPrime[(int)i]){
                for(long j=i*i;j<=1000000;j+=i)
                    isPrime[(int)j]=false;
            }
        } //소수인 수들은 true 아닌 수들은 false
        for(int i=0;i<T;i++){
            long input=scanner.nextLong();
            int count=0;

            for(int j=2;j<=input/2;j++){ //앞 뒤 순서가 다른 것을 안세기 위해 절반만
                if(isPrime[j]&&isPrime[(int) (input-j)]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
import java.util.Scanner;

public class _2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong(); //어떤 자연수
        long answer=0; //정답
        for(int i=1;i<=N;i++){
            long M=i; //생성자 가설
            long sum=i; //분해합 저장할 곳
            while(M>=1){ //입력받은 수 N의 생성자 찾기
                sum+=M%10;
                M/=10;
            }
            if(sum==N) { //M의 분해합이 N이면
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}

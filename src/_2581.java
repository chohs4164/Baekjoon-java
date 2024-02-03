import java.util.Scanner;

public class _2581 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int M,N,min=0,sum=0,count=0,flag=0;
        M=scanner.nextInt();
        N=scanner.nextInt();
        for(int i=M;i<=N;i++){ //M부터 N 사이의 소수찾기
            for(int j=1;j<=i;j++){ //소수 판독
                if(i%j==0)
                    count++;
            }
            if(count==2) { //소수이면
                sum += i;
                if(flag==0) {
                    min = i;
                    flag = 1;
                }
            }
            count=0; //0으로 초기화
        }
        if(sum==0) //합이 0이면 소수가 없는 것
            System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
import java.util.Scanner;
import java.util.ArrayList;
public class _1978 {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<Integer>();
        int N,count=0,answer=0;
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        for(int i=0;i<N;i++){
            a.add(scanner.nextInt());
        }
        for(int i=0;i<N;i++){ //숫자 입장
            for(int j=1;j<=a.get(i);j++){ //소수 판독
                if(a.get(i)%j==0) //나누어지는 수이면
                    count++;
            }
            if(count==2){ //소수는 나누어지는 수가 1과 자기 자신 2개 이므로
                answer++;
            }
            count=0;
        }
        System.out.println(answer);
    }
}

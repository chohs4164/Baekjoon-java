import java.util.Scanner;

public class _2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt(); //주어지는 카드의 개수
        Long M=scanner.nextLong(); //최대한 가깝게 만들어야하는 수
        int cardArray [] = new int[N]; //주어지는 숫자 카드들
        int sum=0;
        long answer=0;
        for(int i=0;i<N;i++){
            cardArray[i]=scanner.nextInt();
        }
        for(int i=0;i<cardArray.length-2;i++){
            for(int j=i+1;j<cardArray.length-1;j++){
                for(int k=j+1;k<cardArray.length;k++){
                  sum = cardArray[i]+cardArray[j]+cardArray[k];

                  if(M==sum) //M과 같은 값을 만들 수 있으면
                      answer=sum;

                  if(answer<sum&&sum<M)
                      answer=sum;
                }
            }
        }
            System.out.println(answer);
    }
}
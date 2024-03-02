import java.util.Scanner;

public class _4948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int count=0;
            long input=scanner.nextLong();
            if(input==0)
                return;
            if(input<1||input>123456)
                return;
            for(long j=input+1;j<=2*input;j++) {
                if(Prime(j))
                    count++;
            }
            System.out.println(count);
        }
    }
    public static boolean Prime(long n){
        if(n==0||n==1)
            return false;
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
import java.util.Scanner;

public class _24313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1=scanner.nextInt();
        int a0=scanner.nextInt();
        int c=scanner.nextInt();
        int n0=scanner.nextInt();
        int count=0;
        for(int i=n0;i<=100;i++){
            if(a1*i+a0<=c*i)
                count++;
        }
        if(count==100-n0+1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

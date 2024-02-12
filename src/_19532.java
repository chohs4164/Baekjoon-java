import java.util.Scanner;

public class _19532 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        int e= scanner.nextInt();
        int f= scanner.nextInt();

        int x=0,y=0;
        for(int i=-999;i<=999;i++){
            for(int j=-999;j<=999;j++){
                x=i;
                y=j;

                if(a*x+b*y==c&&d*x+e*y==f) {
                    System.out.print(x+" "+y);
                    return;
                }
            }
        }

    }
}
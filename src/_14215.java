import java.util.Scanner;

public class _14215 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        while(a+b<=c)
            c--;
        while(b+c<=a)
            a--;
        while(c+a<=b)
            b--;

        System.out.println(a+b+c);
    }
}
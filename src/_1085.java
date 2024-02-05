import java.util.Scanner;

public class _1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l []=new int[4];
        for(int i=0;i<4;i++){
            l[i]=0;
        }
        int x,y,w,h;
        x=scanner.nextInt();
        y=scanner.nextInt();
        w=scanner.nextInt();
        h=scanner.nextInt();

        l[0]= x;
        l[1]= y;
        l[2]= w-x;
        l[3]= h-y;

        int min=l[0];
        for(int i:l){ //i는 내부의 값의 형식
            if(min>i)
                min=i;
        }
        System.out.println(min);
    }
}
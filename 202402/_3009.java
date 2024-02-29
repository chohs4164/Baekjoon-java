import java.awt.*;
import java.util.Scanner;

public class _3009 {
    public static int calculatex(Point[] p){
        if(p[0].x==p[1].x)
            return p[2].x;
        if(p[1].x==p[2].x)
            return p[0].x;
        else
            return p[1].x;
    }
    public static int calculatey(Point[] p){
        if(p[0].y==p[1].y)
            return p[2].y;
        if(p[1].y==p[2].y)
            return p[0].y;
        else
            return p[1].y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point p [] = new Point[4];
        int answerx,answery;
        for(int i=0;i<3;i++){ //점 3개 입력 받기
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            p[i]=new  Point(x,y);
        }
        answerx=calculatex(p);
        answery=calculatey(p);
        System.out.println(answerx+" "+answery);
    }
}

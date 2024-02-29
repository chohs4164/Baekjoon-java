import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _9063 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int minX,minY,maxX,maxY;
        int N;
        N=scanner.nextInt();
        ArrayList<Point> a = new ArrayList<Point>(N);
        Point p []=new Point[N];
        for(int i=0;i<N;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            p[i]=new Point(x,y);
            a.add(p[i]);
        }
        minX=p[0].x;
        minY=p[0].y;
        maxX=p[0].x;
        maxY=p[0].y;
        for(int i=1;i<N;i++){
            if(minX>p[i].x)
                minX=p[i].x;
            if(minY>p[i].y)
                minY=p[i].y;
            if(maxX<p[i].x)
                maxX=p[i].x;
            if(maxY<p[i].y)
                maxY=p[i].y;
        }
        int answer=(maxX-minX)*(maxY-minY);
        System.out.println(answer);
    }
}

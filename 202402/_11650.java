import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Point p[]=new Point[N];
        for(int i=0;i<N;i++){
            String [] coordinates = br.readLine().split(" ");
            int x=Integer.parseInt(coordinates[0]);
            int y=Integer.parseInt(coordinates[1]);
            p[i]=new Point(x,y);
        }
        Arrays.sort(p, new Comparator<Point>(){
            @Override
            public int compare(Point p1, Point p2) {
                if(p1.x != p2.x)
                    return Integer.compare(p1.x, p2.x);
                else
                    return Integer.compare(p1.y, p2.y);
            }
        });
        for(int i=0;i<N;i++) {
            System.out.print(p[i].x+" ");
            System.out.print(p[i].y);
            System.out.println();
        }
    }
}

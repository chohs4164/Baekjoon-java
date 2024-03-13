import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque=new LinkedList<>();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer stackORqueue = new StringTokenizer(br.readLine()); //스택인지 큐인지
        StringTokenizer number = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            int num=Integer.parseInt(number.nextToken());
            //큐이면
            if(Integer.parseInt(stackORqueue.nextToken())==0)
                deque.addLast(num);
        }
        int M=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int tmp=Integer.parseInt(st.nextToken());
            deque.addFirst(tmp);
            sb.append(deque.pollLast()).append(' ');
        }
        System.out.println(sb);
    }
}
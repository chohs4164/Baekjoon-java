import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<int[]> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        String in= br.readLine();
        StringTokenizer st = new StringTokenizer(in);
        for(int i=1;i<=N;i++){
            //인덱스 값과 그 안의 종이에 적힌 값 넣기
            int [] arr = {i,Integer.parseInt(st.nextToken())};
            deque.add(arr);
        }
        while(deque.size()!=1){
            int [] now = deque.pollFirst();
            sb.append(now[0]).append(' ');
            if(now[1]>0){
                for(int i=1;i<now[1];i++){
                    deque.addLast(deque.pollFirst());
                }
            }
            if(now[1]<0){
                for(int i=now[1];i<0;i++){
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        sb.append(deque.pollFirst()[0]);
        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class _2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for(int i=1;i<=N;i++){
            deque.add(i);
        }
        while(deque.size()!=1){
            deque.pollFirst();
            deque.add(deque.pollFirst());
        }
        sb.append(deque.pollFirst());
        System.out.println(sb);
    }
}
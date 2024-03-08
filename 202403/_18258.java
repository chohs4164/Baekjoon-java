import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class _18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String [] input = br.readLine().split(" ");
            switch (input[0]){
                case "push":
                    deque.add(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    if(deque.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(deque.poll()).append('\n');
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if(deque.isEmpty())
                        sb.append(1).append('\n');
                    else
                        sb.append(0).append('\n');
                    break;
                case "front":
                    if(deque.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(deque.peekFirst()).append('\n');
                    break;
                case "back":
                    if(deque.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(deque.peekLast()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
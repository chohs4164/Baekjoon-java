import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class _28279 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String [] input=br.readLine().split(" ");
            switch (Integer.parseInt(input[0])){
                case 1:
                    deque.addFirst(Integer.parseInt(input[1]));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(input[1]));
                    break;
                case 3:
                    if(deque.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(deque.pollFirst()).append('\n');
                    break;
                case 4:
                    if(deque.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(deque.pollLast()).append('\n');
                    break;
                case 5:
                    sb.append(deque.size()).append('\n');
                    break;
                case 6:
                    if(deque.isEmpty())
                        sb.append(1).append('\n');
                    else
                        sb.append(0).append('\n');
                    break;
                case 7:
                    if(deque.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(deque.peekFirst()).append('\n');
                    break;
                case 8:
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
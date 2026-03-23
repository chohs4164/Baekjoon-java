import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String command = null;
            Integer num = null;
            String commandAndNum[] = br.readLine().trim().split(" ");
            command = commandAndNum[0]; // 명렬
            try {
                num = Integer.parseInt(commandAndNum[1]); // 숫자, 없다면 null
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            switch (command) {
                case "push":
                    queue.offerLast(num);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        sb.append(queue.pollFirst()).append("\n");
                    } else
                        sb.append("-1\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty())
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        sb.append(queue.peekFirst()).append("\n");
                    } else
                        sb.append("-1\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        sb.append(queue.peekLast()).append("\n");
                    } else
                        sb.append("-1\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

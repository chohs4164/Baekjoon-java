import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push_front")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                deque.addFirst(x);

            } else if (command.startsWith("push_back")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                deque.addLast(x);

            } else if (command.equals("pop_front")) {
                if (deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.pollFirst()).append("\n");

            } else if (command.equals("pop_back")) {
                if (deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.pollLast()).append("\n");

            } else if (command.equals("size")) {
                sb.append(deque.size()).append("\n");

            } else if (command.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");

            } else if (command.equals("front")) {
                if (deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.peekFirst()).append("\n");

            } else if (command.equals("back")) {
                if (deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
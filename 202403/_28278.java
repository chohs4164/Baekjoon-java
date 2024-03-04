import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class _28278 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자
        for(int i=0;i<N;i++){
            String input = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(input);
            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case 3: {
                    sb.append(stack.size()).append("\n");
                    break;
                }
                case 4:
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
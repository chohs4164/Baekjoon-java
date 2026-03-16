import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자바에서 기본으로 제공하는 Stack 클래스 그냥 쓰기
        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt(); // 명령 갯수

        for (int i = 0; i < N; i++) {
            String command = sc.next(); // 명령 읽기

            if (command.equals("push")) {
                int x = sc.nextInt();
                stack.push(x);
            }
            else if (command.equals("pop")) {
                // 비어있으면 -1, 아니면 맨 위 제거 후 출력
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }
            else if (command.equals("size")) {
                System.out.println(stack.size());
            }
            else if (command.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            else if (command.equals("top")) {
                // 비어있으면 -1, 아니면 맨 위 출력(제거 안 함)
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}

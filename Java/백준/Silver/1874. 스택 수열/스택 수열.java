import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<Integer>(); // 스택하나
        ArrayList<Integer> list = new ArrayList<>(); // 입력받은 수열을 저장할 리스트 하나
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            // 수열 저장
            list.add(Integer.parseInt(br.readLine()));
        }
        int next = 1; // 다음에 스택에 넣을 숫자를 관리하는 변수
        // 다음에 스택에 넣을 숫자가 원하는 수열의 수보다 작으면
        for (int j = 0; j < n; j++) { // j: 수열의 인덱스를 위한 변수
            while (next <= list.get(j)) {
                // 스택에 맨 위에 오는 숫자가 원하는 숫자가 될때까지 push
                stack.push(next);
                sb.append("+\n");
                next++;
            }
            // 원하는 숫자인지 검증
            if (!stack.isEmpty() && stack.peek().equals(list.get(j))) {
                stack.pop();
                sb.append("-\n");
            }
            // 스택의 맨 위에 있는 수보다 원하는 수가 더 큰 경우
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }

}


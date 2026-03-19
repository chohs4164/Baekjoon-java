import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Tower {
    int height; // 타워의 높이
    int position; // 그 타워의 순서(ex) 2번째 타워..

    Tower(int height, int position) {
        this.height = height;
        this.position = position;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder(); // 답 출력용
        List<Integer> list = new ArrayList<>(); // 탑들의 높이 저장용
        int N = Integer.parseInt(br.readLine()); // 탑 갯수
        Deque<Tower> stack = new ArrayDeque<>();

        // 한 줄 받고
        String line = br.readLine();
        // 쪼개서
        StringTokenizer st = new StringTokenizer(line);
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        // j는 list의 접근하고자하는 인덱스용
        for (int j = 0; j < N; j++) {
            int now = list.get(j); // answer를 판단하고자 하는 위치의 현재의 나

            // 나보다 왼쪽에 있는 탑들이 나보다 작으면 앞으로 쓸모 없으므로 스택에서 제거
            while (!stack.isEmpty() && stack.peek().height < now) {
                stack.pop();
            }
            // 스택이 비었다는 건 나보다 큰 놈이 왼쪽에 없다는 것이므로 0 저장
            if (stack.isEmpty()) {
                answer.append(0).append(" ");
            }
            // 스택이 안비었으면 나보다 큰 놈이 있을것이니 그놈 peek하고 position 저장
            else {
                answer.append(stack.peek().position).append(" ");
            }
            // 나도 누군가의 후보가 되기 위해 stack에 들어가기
            stack.push(new Tower(now, j+1));
        }
        System.out.println(answer.toString().trim());
    }
}

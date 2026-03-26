import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 큐의 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수

        // 1. 큐 초기화 (1부터 N까지 순서대로 넣기)
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        // 2. 뽑을 숫자들의 위치 입력받기
        st = new StringTokenizer(br.readLine());
        int totalMoves = 0; // 연산 2, 3의 총합

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            // 3. 목표 숫자가 현재 리스트의 몇 번째(index)에 있는지 확인
            int targetIndex = list.indexOf(target);
            int halfIndex = list.size() / 2;

            // 4. 중간 지점을 기준으로 왼쪽으로 돌릴지 오른쪽으로 돌릴지 결정
            // 짝수일 때는 중간 인덱스가 뒤쪽으로 치우치므로, index <= halfIndex 기준이 효율적입니다.
            if (targetIndex <= halfIndex) {
                // 왼쪽으로 이동 (연산 2)
                for (int j = 0; j < targetIndex; j++) {
                    list.addLast(list.removeFirst());
                    totalMoves++;
                }
            } else {
                // 오른쪽으로 이동 (연산 3)
                for (int j = 0; j < list.size() - targetIndex; j++) {
                    list.addFirst(list.removeLast());
                    totalMoves++;
                }
            }

            // 5. 목표 숫자가 맨 앞에 왔으므로 제거 (연산 1)
            list.removeFirst();
        }

        System.out.println(totalMoves);
    }
}
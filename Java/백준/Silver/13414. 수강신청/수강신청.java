import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();

        String[] inputs = br.readLine().split(" ");
        int K = Integer.parseInt(inputs[0]); // 과목의 수강 가능 인원
        int L = Integer.parseInt(inputs[1]); // 대기목록의 길이

        String[] studentIds = new String[L];

        // 인덱스와 학번을 저장
        for (int i = 0; i < L; i++) {
            String studentId = br.readLine();
            studentIds[i] = studentId;
            map.put(studentId, i);
        }
        int count = 0;
        // 과목의 수강 인원이 다 차거나 대기 목록이 다 마무리 될때까지(1바퀴 탐색)
        for (int j = 0; j < L && count < K; j++) {
            if (map.get(studentIds[j]) == j) {
                sb.append(studentIds[j]).append("\n");
                count++;
            }
        }
        System.out.println(sb);
    }
}

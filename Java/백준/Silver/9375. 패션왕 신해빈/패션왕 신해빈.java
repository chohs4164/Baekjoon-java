import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int answer = 1;
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                String[] input = br.readLine().split(" ");
                String type = input[1];

                // 만약 이미 있는 옷 종류이면
                if (map.containsKey(type)) {
                    int count = map.get(type);
                    map.put(type, ++count);
                }
                // 없는 옷 종류이면
                else
                    map.put(type, 1);
            }
            // 경우의 수 계산
            for (String key : map.keySet()) {
                answer *= (map.get(key) + 1);
            }
            System.out.println(answer - 1);
        }
    }
}
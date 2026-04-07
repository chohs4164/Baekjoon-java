import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> numToName = new HashMap<>();
        HashMap<String, Integer> nameToNum = new HashMap<>();
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]); // 포켓몬의 개수
        int M = Integer.parseInt(inputs[1]); // 문제의 갯수
        // 인덱스와 포켓몬 저장
        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            numToName.put(i, pokemon);
            nameToNum.put(pokemon, i);
        }
        // 문제 시작!
        for (int j = 1; j <= M; j++) {
            // 해당하는 인덱스 키에 대해서 value를 출력함
            String input = br.readLine(); // 입력이 들어오는데
            if (Character.isDigit(input.charAt(0))) {
                // 숫자로 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을
                sb.append(numToName.get(Integer.parseInt(input))).append("\n");
            } else {
                // 문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를
                sb.append(nameToNum.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
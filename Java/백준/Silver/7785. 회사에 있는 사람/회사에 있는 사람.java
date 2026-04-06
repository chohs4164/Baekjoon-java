import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            map.put(input[0], input[1]);
        }

        List<String> names = new ArrayList<>();

        for (String key : map.keySet()) {
            if ("enter".equals(map.get(key)))
                names.add(key);
        }

        Collections.sort(names,Collections.reverseOrder());

        for (String name:names){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
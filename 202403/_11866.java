import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> queue = new ArrayList<>();
        ArrayList <Integer> a = new ArrayList<>();

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        for(int i=1;i<=N;i++){
            queue.add(i); //인덱스 값과 값 숫자를 맞춰서
        }
        while(!queue.isEmpty()){
            for(int i=0;i<K-1;i++){ //K-1번 값을 뒤로
                queue.add(queue.remove(0));
            }
            a.add(queue.remove(0));
        }
        sb.append('<');
        for(int i=0;i<N-1;i++) {
            sb.append(a.get(i)).append(", ");
        }
        sb.append(a.get(N-1)).append('>');
        System.out.println(sb);
    }
}
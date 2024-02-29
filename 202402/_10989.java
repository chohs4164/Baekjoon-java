import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10989 {
    public static void main(String[] args) throws IOException {
        //수의 범위 (1~10000)
        int cnt [] = new int[100001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            cnt[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i=1;i<100001;i++){
            while(cnt[i]>0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}

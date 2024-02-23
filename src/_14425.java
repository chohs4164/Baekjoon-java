import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class _14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        String word[]=new String[N];
        String search[]=new String[M];
        for(int i=0;i<N;i++){
            word[i]=br.readLine();
        }
        for(int j=0;j<M;j++){
            search[j]=br.readLine();
        }
        int count=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(Objects.equals(word[j], search[i]))
                    count++;
            }
        }
        System.out.println(count);
    }
}
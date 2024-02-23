import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        int sorted[]=new int[N];
        String input=br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for(int i=0;i<N;i++){
            sorted[i]=arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted); //배열 오름차순으로 정렬
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        int index=0; //우선순위
        for(int i=0;i<N;i++){
            if(!result.containsKey(sorted[i])){
                result.put(sorted[i],index);
                index++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            int value=result.get(arr[i]);
            sb.append(value).append(' ');
        }
        System.out.println(sb);
    }
}
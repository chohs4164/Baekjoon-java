import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();
        String input1=br.readLine();
        StringTokenizer st1 = new StringTokenizer(input1," ");
        HashMap<Integer,Integer> answer = new HashMap<>();
        for(int i=0;i<N;i++) {
            int now = Integer.parseInt(st1.nextToken());
            //처음 값이 들어온다면 1로 설정, 이미 존재한다면 카운트 증가
            answer.put(now,answer.getOrDefault(now,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        int M=Integer.parseInt(br.readLine());
        String input2=br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2," ");
        for(int i=0;i<M;i++){
            int search=Integer.parseInt(st2.nextToken());
            if(answer.containsKey(search)) //값이 있으면
                sb.append(answer.get(search)).append(" ");
            if(!answer.containsKey(search)) //값이 없으면
                sb.append(0+" ");
        }
        System.out.println(sb);
    }
}
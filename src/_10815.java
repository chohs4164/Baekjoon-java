import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int card_set [] = new int[N];
        String input=br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        for(int i=0;i<N;i++){
            card_set[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card_set);
        int M=Integer.parseInt(br.readLine());
        input= br.readLine();
        st=new StringTokenizer(input);
        int search_card[]=new int[M];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            boolean flag=false;
            search_card[i]=Integer.parseInt(st.nextToken());
            //이분 탐색
            int first = 0; //첫 인덱스
            int last = N-1; //마지막 인덱스
            int mid;
            while(first<=last){
                mid=(first+last)/2; //중간 인덱스를 얻고

                if(card_set[mid]==search_card[i]) { //값을 찾으면
                    sb.append(1+" ");
                    flag=true;
                    break;
                }
                if(card_set[mid]<search_card[i])
                    first=mid+1;
                if(card_set[mid]>search_card[i])
                    last=mid-1;
            }
            if(!flag)
                sb.append(0+" ");
        }
        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class _1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()); //배열하고자 하는 수
        int length=(int)(Math.log10(N)+1); //자릿수 계산
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]= N%10;
            N/=10;
        }
        Arrays.sort(arr);
        for(int i=length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
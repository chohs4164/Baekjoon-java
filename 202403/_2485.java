import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int [] gap = new int[N-1];
        for(int i=0;i<N;i++){ //가로수가 심어져 있는 곳 입력받기
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=1;i<N-1;i++){
            gap[i-1]=arr[i]-arr[i-1];
        }
        Arrays.sort(gap);
        //차이들의 최대공약수 찾기
        int result = findGCD(gap); //간격들의 최대공약수
        int count=0;
        int answer=(arr[arr.length-1]-arr[0])/result+1; //원래 심어져있어야 하는 나무의 갯수
        System.out.println(answer-arr.length);

    }
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int findGCD(int [] gap){
        int min=gap[0];
        for(int i=1;i<gap.length;i++){
            min=gcd(min,gap[i]);
        }
        return min;
    }
}
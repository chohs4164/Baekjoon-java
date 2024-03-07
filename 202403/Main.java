import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> a = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int count=1;
        String [] input = br.readLine().split(" ");

        for(int i=0;i<N;i++) {
            int now = Integer.parseInt(input[i]);
            if(now==count) { //현재 순서이면
                a.add(now); //배열에
                count++; //다음 숫자로 이동
            }
            else //현재 순서가 아니면
                stack.push(now); //잠시 스택에
            while(!stack.isEmpty()) { //스택이 비어있지 않으면
                int tmp=stack.pop();
                if(count==tmp) { //현재 필요한 값이라면
                    a.add(tmp);
                    count++;
                }
                else { //필요한 값이 아니라면
                    stack.push(tmp);
                    break; //순서대로 정렬할 수 없는것
                }
            }
        }
        while(!stack.isEmpty()){
            a.add(stack.pop()); //남은 값들을 모두 배열에
        }
        if(a.get(N-1)==N) //정렬되어 있다면
            System.out.println("Nice");
        else
            System.out.println("Sad");
    }
}
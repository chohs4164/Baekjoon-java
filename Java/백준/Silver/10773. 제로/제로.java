import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int sum=0;
        int K = sc.nextInt();
        // 스택에 돈 액수 저장
        for (int i = 0; i < K; i++) {
           int num = sc.nextInt();
           if(num == 0)
               stack.pop();
           else
               stack.push(num);
        }
        // 하나씩 빼면서 합 하기
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}

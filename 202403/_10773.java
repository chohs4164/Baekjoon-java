import java.util.Scanner;
import java.util.Stack;

public class _10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int K=scanner.nextInt();
        int sum=0;
        for(int i=0;i<K;i++){
            int input=scanner.nextInt();
            if(input==0)
                    stack.pop();
            else
                stack.push(input);
        }
        while(!stack.isEmpty())
            sum+=stack.pop();

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}
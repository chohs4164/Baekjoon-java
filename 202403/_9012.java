import java.util.Scanner;
import java.util.Stack;

public class _9012 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++) {
            String input = scanner.nextLine();
            boolean flag=true;
            for(int j=0;j<input.length();j++){
                char now=input.charAt(j);
                if(now=='(')
                    stack.push(now);
                if(now==')'){
                    if(stack.isEmpty()||stack.pop()!='(') {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag&& stack.isEmpty())
                sb.append("YES").append('\n');
            else
                sb.append("NO").append('\n');
            stack.clear(); //다음 문자를 받기 전에 스택 초기화
        }
        System.out.println(sb);
    }
}
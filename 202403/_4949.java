import java.util.Scanner;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args) {
      Stack<Character> stack = new Stack<>();
      Scanner scanner = new Scanner(System.in);

      while(true) {
          StringBuilder sb = new StringBuilder();
          boolean flag=true;
          String input = scanner.nextLine();

          if(input.equals("."))
              break;
          for (int i = 0; i < input.length(); i++) {
              char now = input.charAt(i);
              if (now == '(' || now == '[')
                  stack.push(now);
              if (now == ')') {
                  if (stack.isEmpty() || stack.pop() != '(') {
                      flag = false;
                      break;
                  }
              }
              if(now == ']'){
                  if(stack.isEmpty()||stack.pop() != '[') {
                      flag = false;
                      break;
                  }
              }
          }
          if(flag&&stack.isEmpty())
              sb.append("yes").append('\n');
          if(!flag|| !stack.isEmpty())
              sb.append("no").append('\n');
          System.out.print(sb);
          stack.clear();
      }
    }
}
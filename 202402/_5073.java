import java.util.Scanner;
public class _5073 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int l1,l2,l3;

       while(true) {
           l1=scanner.nextInt();
           l2=scanner.nextInt();
           l3=scanner.nextInt();
           if(l1==0&&l2==0&&l3==0) //0 0 0이 입력되면 종료
               break;
           else { //0 0 0이 아니면
               if(l1 + l2 <= l3 || l2 + l3 <= l1 || l3 + l1 <= l2)  //삼각형의 조건을 만족하지 못하는 경우
                   System.out.println("Invalid");
               else { //삼각형의 조건을 만족하는데
                   if (l1 == l2 && l2 == l3) //세 변의 길이가 같은 경우
                       System.out.println("Equilateral");
                   if (l1 == l2 && l1 != l3 || l2 == l3 && l1 != l2 || l3 == l1 && l1 != l2) //두 변의 길이만 같은 경우
                       System.out.println("Isosceles");
                   if (l1 != l2 && l2 != l3 && l3 != l1) //세 변의 길이가 다른 경우
                       System.out.println("Scalene");
               }
           }
       }
    }
}

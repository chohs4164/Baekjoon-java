import java.util.Scanner;

public class _2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count5 = 0, count3 = 0;
        for (int i = 0; i <= N / 3; i++) { //3kg을 늘려가보면서
            count3 = i;
            for (int j = N / 5; j >= 0; j--){ //5kg을 줄여가보면서
                count5 = j;
                if ((3 * count3) + (5 * count5) == N) { //숫자를 찾으면
                    System.out.println(count3+count5);
                    return;
                }
            }
        }
            System.out.println(-1);
    }
}

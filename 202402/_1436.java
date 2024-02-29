import java.util.Scanner;

public class _1436 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int series = 0;

        int num = 0;

        while (series < N) {

            num++;

            int count = 0;

            int temp = num;

            while (temp > 0) {

                if (temp % 10 == 6) {

                    count++;

                    if (count >= 3) {

                        series++;

                        break;

                    }

                } else {

                    count = 0;

                }

                temp /= 10;

            }

        }

        System.out.println(num);

    }

}


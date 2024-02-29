import java.util.Scanner;

public class _1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //세로
        int M = scanner.nextInt(); //가로
        int answer = Integer.MAX_VALUE; //최소 다시 칠해야하는 칸의 수
        scanner.nextLine(); //개행문자 날리기

        char arr[][] = new char[N][M];
        for (int i = 0; i < N; i++) { //보드 값 입력받기
            String a = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = a.charAt(j);
            }
        }
        for (int i = 0; i < M - 7; i++) {
            for (int j = 0; j < N - 7; j++) {
                int repaintCount = calculateRepaint(arr, j, i);
                answer = Math.min(answer, repaintCount);
            }
        }
        System.out.println(answer);
    }
        private static int calculateRepaint(char arr[][],int startCol,int startRow){
            int repaintCount1=0; //시작 색이 W인 경우
            int repaintCount2=0; //시작 색이 B인 경우
            //전체 M*N크기의 보드에서

            //8*8크기의 체스판을 만들어가며
            for (int i = startCol; i < startCol + 8; i++) {
                for (int j = startRow; j < startRow + 8; j++) {
                    if ((i + j) % 2 == 0) { //흰부터 시작할때
                        if (arr[i][j] != 'W')
                            repaintCount1++;
                        if (arr[i][j] != 'B')
                            repaintCount2++;
                    }
                    else { //검부터 시작할때
                        if (arr[i][j] != 'B')
                            repaintCount1++;
                        if (arr[i][j] != 'W')
                            repaintCount2++;
                    }
                }
            }
            return Math.min(repaintCount1,repaintCount2);
        }
    }

import java.util.Scanner;

public class _2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int arr[]=new int[N];
        int tmp;
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        int least;
        for(int i=0;i<N-1;i++){
            least=i;
            for(int j=i+1;j<N;j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[least];
            arr[least] = tmp;
        }
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }
    }
}
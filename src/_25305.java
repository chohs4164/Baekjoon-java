import java.util.Scanner;

public class _25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int k=scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        int tmp;
        for(int i=1;i<N;i++){
            for(int j=0;j<N-1;j++){
                if(arr[j]<arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println(arr[k-1]);
    }
}
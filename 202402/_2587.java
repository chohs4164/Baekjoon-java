import java.util.Scanner;

public class _2587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        int tmp;
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum/5);
        for(int j=1;j<5;j++){
            for(int k=0;k<4;k++){
                if(arr[k]>arr[k+1]){
                    tmp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=tmp;
                }
            }
        }
        System.out.println(arr[2]);
    }
}

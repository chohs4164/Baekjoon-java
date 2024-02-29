import java.io.IOException;
import java.util.*;


public class _10814 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        String [][] arr=new String[N][2];

        for(int i=0;i<N;i++){
            arr[i][0]=scanner.next(); //나이
            arr[i][1]=scanner.next(); //이름
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                //양수이면 교체(오름차순으로 정렬된다는 뜻)
                return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
            }
        });

        for(int i=0;i<N;i++){
            System.out.print(arr[i][0]+" ");
            System.out.println(arr[i][1]);
        }
    }


}

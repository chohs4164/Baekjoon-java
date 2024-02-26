import java.io.IOException;
import java.util.*;

public class _1764 {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        int N=Integer.parseInt(st.nextToken()); //듣도 못한 사람의 수
        int M=Integer.parseInt(st.nextToken()); //보도 못한 사람의 수
        HashMap<String,Boolean> listen = new HashMap<>();
        ArrayList<String> seen = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0;i<N;i++){ //듣도 못한 사람
            listen.put(scanner.nextLine(),true);
        }
        int count=0;
        for(int i=0;i<M;i++){ //보도 못한 사람
            String name = scanner.nextLine();
            if(listen.containsKey(name)) {
                answer.add(name);
                count++;
            }
        }
        Collections.sort(answer);
        System.out.println(count);
        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }
}
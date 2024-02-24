import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        HashMap<String,String> status=new HashMap<String,String>();

        for(int i=0;i<n;i++){
            String input[]=br.readLine().split(" ");
            String name=input[0];
            String stat=input[1];
            status.put(name, stat);
        }
        ArrayList<String> result = new ArrayList<String>(status.keySet());
        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for(int i=result.size()-1;i>=0;i--){
            if(status.get(result.get(i)).equals("enter"))
                sb.append(result.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
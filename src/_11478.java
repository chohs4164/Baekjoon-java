import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        HashMap<String,Boolean> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            for(int j=i;j<word.length();j++){
                map.put(word.substring(i,j+1),true);
            }
        }
        System.out.println(map.size());
    }
}
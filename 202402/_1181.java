import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()); //단어의 갯수
        ArrayList<String> a = new ArrayList<String>(); //단어를 저장할 ArrayList
        for(int i=0;i<N;i++){ //단어 입력받기
            String word = br.readLine();
            a.add(word);
        }
        HashSet<String> uniqueWords = new HashSet<String>(a);
        ArrayList<String> sortedWords = new ArrayList<String>(uniqueWords);

        Collections.sort(sortedWords,(s1,s2)->{
            if(s1.length()!=s2.length())
                return Integer.compare(s1.length(),s2.length());
            else
                return s1.compareTo(s2);
        });
        for(String i:sortedWords){
            System.out.println(i);
        }
    }
}

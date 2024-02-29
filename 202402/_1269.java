import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        HashMap <Integer,Boolean> setA = new HashMap<>();
        HashMap <Integer,Boolean> setB = new HashMap<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        input=br.readLine();
        st=new StringTokenizer(input);
        for(int i=0;i<A;i++){ //A집합
            int in=Integer.parseInt(st.nextToken());
            setA.put(in,true);
        }
        input=br.readLine();
        st=new StringTokenizer(input);
        for(int i=0;i<B;i++){ //B집합
            int in=Integer.parseInt(st.nextToken());
            setB.put(in,true);
        }
        int count=0;
        for(int key:setA.keySet()){
            if(!setB.containsKey(key))
                count++;
        }
        for(int key:setB.keySet()) {
            if (!setA.containsKey(key))
                count++;
        }
        System.out.println(count);
    }
}

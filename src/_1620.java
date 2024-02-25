import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class _1620 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt(); //도감에 수록되어 있는 포켓몬의 갯수
        int M=scanner.nextInt(); //맞춰야 하는 문제의 갯수

        //개행 문자 소비
        scanner.nextLine();

        String pokemon[]=new String[N+1];
        HashMap<String,Integer> book = new HashMap<String,Integer>();
        for(int i=1;i<=N;i++){
            String input=scanner.nextLine();
            book.put(input,i);
            pokemon[i]=input;
        }
        for(int i=0;i<M;i++){
            String in=scanner.nextLine(); //값을 입력받는데
            try{
                int number=Integer.parseInt(in); //숫자를 받으면
                System.out.println(pokemon[number]);
            }catch (Exception e){ //문자이면 숫자변환 과정 중 오류가 발생할테니
                System.out.println(book.get(in));
            }
        }
    }
}
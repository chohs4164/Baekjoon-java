import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int input,sum=0;
        while(true){
            input=scanner.nextInt();

            if(input==-1){
                break;
            }

            if(input!=-1) { //-1이 아니라면
                for (int i = 1; i < input; i++) { //약수를 구하고 오름차순으로 저장
                    if (input % i == 0) //약수라면
                        a.add(i);
                }
                for (int j = 0; j < a.size(); j++)
                    sum += a.get(j);
                if (sum == input) {
                    System.out.print(input + " = ");
                    for (int k = 0; k < a.size(); k++) {
                        if (k == a.size() - 1) //마지막 수는 플러스 기호 없이
                            System.out.print(a.get(k));
                        else
                            System.out.print(a.get(k) + " + ");
                    }
                    System.out.println();
                } else
                    System.out.println(input + " is NOT perfect.");

                a.clear(); //ArrayList 초기화
                sum = 0; //sum 초기화
            }
        }
        scanner.close();
    }
}

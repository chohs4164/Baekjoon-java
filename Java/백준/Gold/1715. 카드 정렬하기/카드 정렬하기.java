import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> pq = new PriorityQueue();
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < N; i++) {
            //큐에 수 저장
            pq.add(Integer.parseInt(br.readLine()));
        }
        // 두개 뽑아서
        while(pq.size()>1){
                int first = pq.poll(); // 10
                int second = pq.poll(); // 20
                int sum = first + second;
                answer += sum;
                pq.add(sum);
        }
        System.out.println(answer);
    }
}
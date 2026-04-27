import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // 1. commands[i]에서 start, end, k 추출
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            // 2. array 자르기 (Arrays.copyOfRange 활용 추천)
            int[] newArray = Arrays.copyOfRange(array, start - 1, end);
            // 3. 정렬하기 (Arrays.sort 활용)
            Arrays.sort(newArray);
            // 4. k번째 값 answer[i]에 저장
            answer[i] = newArray[k-1];
        }

        return answer;
    }

    // [로컬 테스트용 메인 - 제출할 땐 무시됨]
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 입출력 예시에 나온 데이터를 미리 정의 (임시 데이터)
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        // 결과 출력 확인
        int[] result = sol.solution(array, commands);
        System.out.println(Arrays.toString(result)); // [5, 6, 3]이 나오면 성공!
    }
}
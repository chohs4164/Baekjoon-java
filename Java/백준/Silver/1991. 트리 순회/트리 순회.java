import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    static int[][] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        tree = new int[26][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            int parent = input[0].charAt(0) - 'A';

            // 왼쪽 자식
            char leftChar = input[1].charAt(0);
            if (leftChar == '.') { // 자식이 없는 경우
                tree[parent][0] = -1;
            } else {
                tree[parent][0] = leftChar - 'A';
            }

            // 오른쪽 자식
            char rightChar = input[2].charAt(0);
            if (rightChar == '.') {
                tree[parent][1] = -1;
            } else {
                tree[parent][1] = rightChar - 'A';
            }
        }
        preorder(0);
        System.out.println();
        inorder(0);
        System.out.println();
        postorder(0);
    }

    public static void preorder(int current) {
        if (current == -1) return;

        System.out.print((char) (current + 'A'));
        preorder(tree[current][0]);
        preorder(tree[current][1]);
    }

    public static void inorder(int current) {
        if (current == -1) return;

        inorder(tree[current][0]);
        System.out.print((char) (current + 'A'));
        inorder(tree[current][1]);
    }

    public static void postorder(int current) {
        if (current == -1) return;

        postorder(tree[current][0]);
        postorder(tree[current][1]);
        System.out.print((char) (current + 'A'));
    }
}
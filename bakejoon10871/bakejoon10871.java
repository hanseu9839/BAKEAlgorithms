package bakejoon10871;

import java.util.Scanner;

public class bakejoon10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, X, a;
        N = scan.nextInt();
        X = scan.nextInt();
        for (int i = 0; i < N; i++) {
            a = scan.nextInt();
            if (a < X)
                System.out.print(a + " ");
        }
        scan.close();
    }
}

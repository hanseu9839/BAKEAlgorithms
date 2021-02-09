package bakejoon1110;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int length = 0;
        int sum;
        int ini = N;

        while (true) {
            int div = N / 10;
            int remain = N % 10;
            System.out.println(div + " " + remain);
            sum = (div + remain) % 10;
            N = (remain * 10) + sum;
            System.out.println(N);
            length++;
            if (ini == N)
                break;
        }
        br.close();
        System.out.println(length);
    }
}

package bakejoon10818;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int min = num[0];
        int max = num[0];
        for (int i = 0; i < n; i++) {
            if (min > num[i]) {
                min = num[i];
            }

            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.print(min + " " + max);
        sc.close();
    }
}

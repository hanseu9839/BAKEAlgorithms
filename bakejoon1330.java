import java.util.Scanner;

public class bakejoon1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        scan.close();
        minute -= 45;
        if (minute < 0) {
            minute = 60 + minute;
            hour--;
            if (hour < 0)
                hour += 24;
        }

        System.out.println(hour + " " + minute);

    }
}
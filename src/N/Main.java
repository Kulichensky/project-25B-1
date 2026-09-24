package N;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lessontime = n * 45;

        int breaktime = (n / 2) * 5 + ((n - 1) / 2) * 15;

        int totalminutes = lessontime + breaktime;

        int hours = 9 + totalminutes / 60;

        int minutes = totalminutes % 60;

        System.out.println(hours + " " + minutes);
    }
}
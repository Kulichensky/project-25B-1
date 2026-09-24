package N;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lessonTime = n * 45;

        int breakTime = (n / 2) * 5 + ((n - 1) / 2) * 15;

        int totalMinutes = lessonTime + breakTime;

        int hours = 9 + totalMinutes / 60;

        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
    }
}
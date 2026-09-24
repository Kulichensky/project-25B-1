package O;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int totalKopecks = (a * 100 + b) * n;

        int totalRubles = totalKopecks / 100;
        int remainingKopecks = totalKopecks % 100;

        System.out.println(totalRubles + " " + remainingKopecks);
    }
}
package O;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int kopeiki = (a * 100 + b) * n;

        int Rubli = kopeiki / 100;
        int Kopeiki = kopeiki % 100;

        System.out.println(Rubli + " " + Kopeiki);
    }
}
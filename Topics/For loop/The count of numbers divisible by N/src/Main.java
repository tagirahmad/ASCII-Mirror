import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int divisibleNumbersCount = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                divisibleNumbersCount++;
            }
        }

        System.out.println(divisibleNumbersCount);
    }
}

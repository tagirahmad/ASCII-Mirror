import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long product = 0;

        for(int i = a; i < b; i++) {
            if (i == a) {
                product = i;
            } else {
                product *= i;
            }

        }

        System.out.println(product);
    }
}
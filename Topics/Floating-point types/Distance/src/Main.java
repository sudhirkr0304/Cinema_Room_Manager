import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        float num = (float) n / (float) m;

        System.out.println(num);
    }
}
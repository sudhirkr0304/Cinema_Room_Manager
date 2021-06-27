import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        double num = scanner.nextDouble();

        System.out.println(Math.pow(num,3) + Math.pow(num,2) + Math.pow(num,1) + 1);
    }
}
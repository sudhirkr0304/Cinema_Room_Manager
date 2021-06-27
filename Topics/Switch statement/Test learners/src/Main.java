import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n == 1) {
            System.out.println("Yes!");
        }
        else if( n > 4) {
            System.out.println("Unknown number");
        }
        else  {
            System.out.println("No!");
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int num = 0 ;
        int sum = 0;

        do {
            num = scanner.nextInt();
            sum += num;
        }
        while ( num != 0 && sum < 1000 );

        System.out.println(sum >= 1000 ? sum - 1000 : sum);
    }
}
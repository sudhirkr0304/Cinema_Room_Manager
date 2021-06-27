import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int num  = 0;

        do {
            num = scanner.nextInt();
            if(num != 0 && num%2== 0)
            {
                System.out.println("even");
            }
            else if( num != 0)
            {
                System.out.println("odd");
            }
        }
        while (num != 0);
    }
}
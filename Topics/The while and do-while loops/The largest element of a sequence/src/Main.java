import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int max = 0;

        int num = -1;

        while ( num != 0 )
        {
            num = scanner.nextInt();
            if(num > max)
            {
                max = num;
            }

        }
        System.out.println(max);
    }
}
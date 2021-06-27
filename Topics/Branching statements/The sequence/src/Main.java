import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int count = 0;
        int n = 1;

        while ( count < num)
        {
            for(int j = 1 ; j <= n ;j++)
            {
                count++;
                System.out.print(n+ " ");
                if(count >= num)
                {
                    break;
                }
            }
            n++;
        }
    }
}
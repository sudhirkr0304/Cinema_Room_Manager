import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        char[][] arr = new char[n][n];


        for(int i = 0;  i< n ;i++)
        {
            for(int j = 0; j < n;j++)
            {
                if(i == j || i == Math.abs(n-1-j) || j == Math.abs(n -1- i) || i == (n / 2) ||  j == (n / 2))
                {
                    arr[i][j] = '*';
                }
                else
                {
                    arr[i][j] = '.';
                }

            }
        }

        for(int i = 0 ; i <  n ; i++)
        {
            for(int j = 0 ; j < n ;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
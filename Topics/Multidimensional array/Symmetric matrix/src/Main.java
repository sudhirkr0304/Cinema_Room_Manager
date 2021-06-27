import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];


        for(int i = 0 ; i < n ;i++)
        {
            for(int j = 0 ;j < n ;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }

        boolean isSystematic = true;

        for(int i = 0 ; i < n ;i++)
        {
            for(int j = 0 ; j < n ;j++)
            {
                if (arr[i][j] != arr[j][i]) {
                    isSystematic = false;
                    break;
                }
            }
        }
        if (isSystematic) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
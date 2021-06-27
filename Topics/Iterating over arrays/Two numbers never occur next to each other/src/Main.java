import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i = 0 ; i < size ;i++)
        {
            array[i] = scanner.nextInt();

        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        boolean con = true;

        for(int i = 0  ; i < size ;i++)
        {
            if(array[i] == n)
            {
                if(i - 1 >= 0 && array[i-1] == m)
                {
                    con = false;
                    break;
                }
                else if( i + 1 < size && array[i+1] == m)
                {
                    con = false;
                    break;
                }
            }
        }

        System.out.println(con);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int max = 1;
        int count = 1;
        for(int i = 1 ; i < n ;i++)
        {
            if(arr[i] > arr[i-1])
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if(count > max)
            {
                max = count;
            }
        }

        System.out.println(max);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] brr = new int[n];

        for(int i = 0 ; i< n ;i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0 ; i< n ;i++)
        {
            brr[i] = scanner.nextInt();
        }

        double max = 0.0;
        int pos = -1;


        for (int i = 0 ;i < n ;i++)
        {
            double tax = (double) arr[i] * (double) brr[i] / 100.00;
            if(tax > max)
            {
                max = tax;
                pos = i;
            }

        }
        System.out.println(pos+1);






    }
}
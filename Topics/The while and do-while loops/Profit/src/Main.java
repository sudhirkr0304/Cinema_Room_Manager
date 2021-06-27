import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        float m = (float)scanner.nextInt();
        float p = (float) scanner.nextInt();
        float k = (float) scanner.nextInt();

        int count = 0;

        while (m < k)
        {
            m = m +  (m * p ) / 100.0f;
            count++;
        }

        System.out.println(count);
    }
}
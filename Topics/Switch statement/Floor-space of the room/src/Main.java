import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int a , b, r ,c;

        switch (str) {

            case "triangle" :
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                double s = (double) (a + b + c) / 2.0;
//                System.out.println(s);
                double area = Math.sqrt(s *(s - (double) a) * (s - (double) b )* (s - (double) c));
                System.out.println(area);
                break;
            case "circle" :
                r = scanner.nextInt();
                System.out.println( 3.14 * (double) r * (double) r);
                break;
            case "rectangle" :
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println((double) a * (double) b);
                break;
        }
    }
}
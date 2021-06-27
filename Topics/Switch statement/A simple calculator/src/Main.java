import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        String op = scanner.next();
        String m = scanner.next();

        switch (op) {

            case "+" :
                System.out.println(Long.valueOf(n) + Long.valueOf(m));
                break;
            case "-" :
               System.out.println(Long.valueOf(n) - Long.valueOf(m));
                break;
            case "*" :
                System.out.println(Long.valueOf(n) * Long.valueOf(m));
                break;
            case "/" :
                if (Long.valueOf(m) == 0) {
                    System.out.println("Division by 0!");
                }
                else {
                    System.out.println(Long.valueOf(n) / Long.valueOf(m));
                }
                break;
            default: System.out.println("Unknown operator");
        }
    }
}
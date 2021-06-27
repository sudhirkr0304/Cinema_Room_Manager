package cinema;
import  java.util.Scanner;


public class Cinema {



    public static void main(String[] args) {
        // Write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int column = scanner.nextInt();
        System.out.println();

        char[][] seats = new char[row][column];

        for(int i = 0 ; i < row ;i++) {
            for (int j = 0 ; j < column; j++) {
                seats[i][j] = 'S';
            }
        }



        int option = -1;

        while (option != 0) {

            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            option = scanner.nextInt();

            if(option == 1) {
                showTheSeats(seats);
            }
            else if ( option == 2) {
               seats = buyATicket(seats);
            }
            else if ( option == 3) {
                showStatistics(seats);
            }
            else  {
                break;
            }

        }


    }

    public static void showTheSeats(char[][] seats) {

        System.out.println("Cinema:");
        System.out.print("  ");
        for(int i  =0 ; i < seats[0].length ;i++)
        {
            System.out.print(i+1+ " ");
        }
        System.out.println();
        for(int i = 0 ; i < seats.length ; i++)
        {
            System.out.print(i+1 + " ");
            for(int j = 0 ; j < seats[0].length ;j++)
            {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static char[][] buyATicket(char[][] seats) {

        Scanner scanner = new Scanner(System.in);

        int row  = seats.length;
        int column = seats[0].length;

        boolean input = true;
        int rownum = 0;
        int seatnum = 0;
        while (input) {

            System.out.println("Enter a row number:");
            rownum = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatnum = scanner.nextInt();

            if( (rownum > 0 && rownum <= row ) && (seatnum > 0 && seatnum <= column) ) {
                input = false;
            }
            else {
                System.out.println("Wrong input!\n");
                continue;
            }
            if(seats[rownum-1][seatnum-1] == 'B' ) {
                System.out.println("That ticket has already been purchased!\n");
                input = true;
            }
        }




        int ticketPrice = 0;


        if( row * column <= 60)
        {
            ticketPrice = 10;
        }
        else
        {

            if(rownum <= row/2){
                ticketPrice = 10;
            }
            else  {
                ticketPrice = 8;
            }




        }

        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println();
        seats[rownum-1][seatnum-1] = 'B';
        return seats;

    }

    public static void showStatistics(char[][] seats) {

        int row = seats.length;
        int column = seats[0].length;

        int count = 0;
        int totalPrice = 0;
        int soldprice = 0;
        for(int i  = 0 ; i < row ;i++ ) {
            for (int  j = 0 ; j < column; j++) {
                if(seats[i][j] == 'B') {
                    count++;
                    soldprice += getTicketPrice(seats,i,j);
                }
                totalPrice += getTicketPrice(seats,i,j);
            }
        }

        float percentage =( (float) count / ((float) row * (float) column) )* 100.00f;
        System.out.println("Number of purchased tickets: "+ count);
        System.out.printf("Percentage: %.2f" , percentage);
        System.out.println("%");
        System.out.println("Current income: $" + soldprice );
        System.out.println("Total income: $" + totalPrice);
        System.out.println();
    }

    public static int getTicketPrice(char[][] seats , int rownum , int seatnum) {

        int row = seats.length;
        int column = seats[0].length;
        int ticketPrice = 0;

        if( row * column <= 60)
        {
            ticketPrice = 10;
        }
        else
        {
            if(rownum < row/2){
                ticketPrice = 10;
            }
            else  {
                ticketPrice = 8;
            }
        }

        return ticketPrice;

    }
}
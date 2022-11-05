import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();;
        int nightHotelCost = scanner.nextInt();

        System.out.println((days * foodPerDay) + (flightCost * 2) + ((days-1) * nightHotelCost));
    }
}
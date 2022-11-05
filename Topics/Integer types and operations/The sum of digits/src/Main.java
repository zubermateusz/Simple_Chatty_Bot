import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczba = scanner.nextInt();
        int suma = (liczba / 10 / 10) + (liczba / 10 % 10) + (liczba % 10);
        System.out.println(suma);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczbaStart = scanner.nextInt();
        //int suma = (liczba / 10 / 10) + (liczba / 10 % 10) + (liczba % 10);
        if (liczbaStart % 10 != 0) {
            System.out.print(liczbaStart % 10);
        }
        System.out.print(liczbaStart / 10 % 10);
        System.out.print(liczbaStart / 10 / 10);
    }
}

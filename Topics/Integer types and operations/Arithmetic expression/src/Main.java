import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        //((n + 1) * n + 2) * n + 3

        int liczba = scanner.nextInt();
        System.out.println(((liczba + 1) * liczba + 2) * liczba + 3);
    }
}
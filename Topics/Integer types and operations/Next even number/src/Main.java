import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczba = scanner.nextInt();
        if(liczba % 2 == 0) System.out.println(liczba +2);
        else System.out.println(liczba + 1);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String linia = scanner.nextLine();
        System.out.println(linia.substring(scanner.nextInt(), scanner.nextInt()+1));
    }
}
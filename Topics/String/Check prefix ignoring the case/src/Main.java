import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.nextLine().trim().toLowerCase();
        if (word.startsWith("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

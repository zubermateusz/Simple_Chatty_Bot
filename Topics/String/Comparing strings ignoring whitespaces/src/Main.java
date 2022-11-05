import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String linia1 = scanner.nextLine().trim().replace(" ", "");
        String linia2 = scanner.nextLine().trim().replace(" ", "");


        if(linia1.equals(linia2)) System.out.println("true");
        else System.out.println("false");
    }
}
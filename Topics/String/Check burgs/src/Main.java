import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String city = scanner.nextLine();
        boolean check = false;
        if(city.length() > 4 && city.endsWith("burg")) check = true;
        else check = false;
        System.out.println(check);
    }
}
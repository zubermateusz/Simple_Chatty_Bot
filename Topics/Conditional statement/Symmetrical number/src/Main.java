import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int liczba = scanner.nextInt();

        //pierwsza cyfra od prawej %10
        //druga cyfra /10%10
        //trzecia cyfra /10/10%10
        //czwarta cyfra /10/10/10

        if (liczba %10 == liczba /10/10/10 && liczba /10%10 == liczba /10/10%10)
            System.out.println(1);
        else System.out.println(20);
    }
}
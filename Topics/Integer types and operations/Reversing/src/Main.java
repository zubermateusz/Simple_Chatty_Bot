import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczbaStart = scanner.nextInt();
        if(liczbaStart%10 != 0) System.out.print(liczbaStart%10);
        System.out.print(liczbaStart / 10 % 10);
        System.out.print(liczbaStart / 10 / 10);


    }
}
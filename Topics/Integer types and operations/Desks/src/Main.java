import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczbaLawek = 0;
        int liczbaStudentow = 0;
        for(int i = 0; i < 3; i++) {
            liczbaStudentow = scanner.nextInt();
            if(liczbaStudentow%2 == 0) liczbaLawek += liczbaStudentow/2;
            else liczbaLawek += liczbaStudentow/2 + liczbaStudentow%2;
        }
        System.out.println(liczbaLawek);
    }
}
import java.util.Scanner;

public class KiemTraSoChanLe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi người dùng nhap 1 so nguyên");

        while (!scanner.hasNextInt()) {
            System.out.println("Vui long nhap lai 1 so nguyen");
            scanner.next();
        }

        int number = scanner.nextInt();

        String message = number % 2 == 0 ? "La so chan" : "La so le";

        System.out.println(message);
        
    }
}

import java.util.Scanner;

public class TimNguyenVaDu {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu 1: ");

        int number1 = scanner.nextInt();

        System.out.println("Nhap vao so thu 2: ");

        int number2 = scanner.nextInt();

        int phNguyen = number1 / number2;
        int phDu = number1 % number2;

        System.out.println("Phan nguyen: " + phNguyen);
        System.out.println("Phan du: " + phDu);
    }
}

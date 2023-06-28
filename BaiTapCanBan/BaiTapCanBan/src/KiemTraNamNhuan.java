import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args)throws Exception {
        /**
         * 1. Năm nhuận là năm chia hết cho 400
         * 2. Năm nhuận là năm chia hết cho 4 và không chia hết cho 100
         */
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap vao 1 năm: ");
        year = scanner.nextInt();

        scanner.close();

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }else {
                    isLeap = false;
                }
            }else {
                isLeap = true;
            }
        }else {
            isLeap = false;
        }

        if (isLeap == true) {
            System.out.println("Đay la nam nhuạn: ");
        }else {
            System.out.println("Khong la nam nhuạn: ");
        }
    }
}

import java.util.Scanner;

public class CongHaiSo {
    public static void main(String[] args) throws Exception {
        //Cách 1: Cộng 2 số trực tiếp
            /*int num1 = 5, num2 = 5, sum;
            sum = num1 + num2;

            System.out.println("Result " + sum);*/
        //Cách 2: Cộng 2 số sử dụng thư viện scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu 1: " );

        while (!scanner.hasNextInt()) {
            System.out.println("Vui long nhap 1 so nguyen: " );
            scanner.next();//Bỏ qua đầu vào không phải số nguyên
        }

        int number1 = scanner.nextInt();


        System.out.println("Nhap so thu 2: " );

        while (!scanner.hasNextInt()) {
            System.out.println("Vui long nhap 2 so nguyen: " );
            scanner.next();//Bỏ qua đầu vào không phải là số nguyên
        }

        int number2 = scanner.nextInt();

        scanner.close();
        
        int result = number1 + number2;

        System.out.println("Result: " + result);
    }
}

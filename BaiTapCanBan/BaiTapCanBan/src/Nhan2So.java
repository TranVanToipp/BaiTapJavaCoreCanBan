import java.util.Scanner;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class Nhan2So {
    public static void main(String[] args) {
        //Trường hợp 1: Nhân 2 số nguyên trong java

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu 1: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Vui long nhap 1 so nguyen thứ 1: ");
            scanner.next();
        }

        int number = scanner.nextInt();

        System.out.println("Nhap so nguyen thu 2: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Vui long nhap 1 so nguyen thứ 2: ");
            scanner.next();
        }

        int number2 = scanner.nextInt();

        int result = number * number2;

        System.out.println("Kết qua: " + result);*/

        //Trường hợp 2: Nhân 2 số thực trong java
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thuc so 1: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Vui long nhap so thuc");
            scanner.next();
        }

        double number1 = scanner.nextDouble();

        System.out.println("Nhap so thuc so 2: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Vui long nhap so thuc");
            scanner.next();
        }

        double number2 = scanner.nextDouble();

        double Result = number1 * number2;

        System.out.println("Result: " + Result);
        
    }
}

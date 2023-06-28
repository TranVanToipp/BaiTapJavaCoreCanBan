class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexNumber sum (ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;

        return temp;
    }
} 

public class Cong2SoPhuc {
    public static void main(String[] args) throws Exception {
        //Cộng 2 số phức: Số phức là gì?
        /**
         * Có dạng: a + bi
         * a và b là số thực, còn b là đơn vị ảo
         */
        ComplexNumber c1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber c2 = new ComplexNumber(5.2, 3.8);

        ComplexNumber temp = ComplexNumber.sum(c1, c2);
        System.out.printf("Kết quả là: "+ temp.real+" + "+ temp.imaginary +"i");//hiển thị kết qua ra màn hình
    }
}



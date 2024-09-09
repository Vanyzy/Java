import java.util.Scanner;

public class bai2if {

    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        double b =scanner.nextDouble();
        System.out.println("Nhap ki tu phep toan (+,*,-,/): ");
        char PhepToan = scanner.next().charAt(0);
        double ketqua = 0;
        boolean hople = true;
         switch (PhepToan) {
            case '+':
            ketqua = a + b;
            break;
            case '-':
            ketqua = a - b;
            break;
            case '*':
            ketqua = a * b;
            break;
            case '/':
           

         }

    }
}


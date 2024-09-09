import java.util.Scanner;

public class Bai1if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong may tinh mua: ");
        int soLuongMay = scanner.nextInt();
        int giaMoiMay;

        if (soLuongMay >= 5) {
             giaMoiMay = 450;
        }
        else 
            giaMoiMay = 500;
        int tongsotien = soLuongMay * giaMoiMay;
        System.out.println("tongsotien: " + tongsotien + " $");
    scanner.close();

    }
}

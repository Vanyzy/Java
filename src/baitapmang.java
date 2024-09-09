import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baitapmang   

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập mảng từ người dùng
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Tách các số dương và sắp xếp chúng
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }
        Collections.sort(positiveNumbers);  // Sắp xếp các số dương tăng dần

        // Ghép các số dương đã sắp xếp vào mảng ban đầu
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr[i] = positiveNumbers.get(index);
                index++;
            }
        }

        // In mảng đã sắp xếp
        System.out.println("Mang sau khi sap xep:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

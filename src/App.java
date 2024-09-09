import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(System.in);
       int a,b,c;
        System.out.println("Moi Nhap a: ");
       a=scanner.nextInt();
        System.out.println("Moi nhap b: ");
        b=scanner.nextInt();
        c=a+b;
        System.out.println("Tong: "+c);
    }
}

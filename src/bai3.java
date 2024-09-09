import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
            int n,n1,n2,n3,n4,kq;
            Scanner sc =new Scanner(System.in);
            System.out.print("Nhap so co 4 chu so:");
            n=sc.nextInt();
             n1=n/1000;
             n2=(n/1000/100);
             n3=(n%100)/10;
             n4=(n%10);
             // System.out.print("n1="+n1,"n2="+n2,"n3="+n3,"n4="+n4);
             kq=n1+n2+n3+n4+2;
             System.out.print("ket qua"+kq);
    }
}
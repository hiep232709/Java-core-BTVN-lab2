import java.util.Scanner;

public class Lab21TinhChuviDientichHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai cua hinh chu nhat: ");
        double chieudai = sc.nextDouble();
        System.out.println("Nhap vao chieu rong cua hinh chu nhat: ");
        double chieurong = sc.nextDouble();
        System.out.println("Chu vi cua hinh chu nhat la: " + chuvi(chieudai, chieurong));
        System.out.println("Dien tich cua hinh chu nhat la: " + dientich(chieudai, chieurong));
    }
    public static double chuvi(double chieudai, double chieurong){
        return (chieudai+chieurong)*2;
    }
    public static double dientich(double chieudai, double chieurong){
        return chieudai*chieurong;
    }
}

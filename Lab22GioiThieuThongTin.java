import java.util.Scanner;

public class Lab22GioiThieuThongTin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin vui long nhap cac thong tin sau:");

        System.out.print("Ho ten: ");
        String name = sc.nextLine();

        System.out.print("Gioi tinh (Nhap nam hoac nu): ");
        String sex = sc.nextLine();

        System.out.print("Tuoi: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Dia chi: ");
        String add = sc.nextLine();

        System.out.println("Xin chao cac bạn, minh ten la " + name + ", nam nay minh " + age + " tuoi, gioi tinh " + sex + ". Hien tai, minh dang song va lam viec tai " + add + ".");
    }
}

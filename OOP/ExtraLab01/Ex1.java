import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("±--------------------------------------±");
            System.out.println("1. Tinh chu vi, dien tich HCN");
            System.out.println("2. Giai PT bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("±--------------------------------------±");
            System.out.print("Chon chuc nang: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tinhChuViDienTichHCN();
                    break;
                case 2:
                    giaiPhuongTrinhBac2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Chuc nang khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void tinhChuViDienTichHCN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai HCN: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong HCN: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        System.out.println("Chu vi cua HCN la: " + chuVi);
        System.out.println("Dien tich cua HCN la: " + dienTich);
        System.out.println("Canh nho nhat cua HCN la: " + canhNhoNhat);
    }

    public static void giaiPhuongTrinhBac2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);

        System.out.println("Delta cua phuong trinh la: " + delta);
        System.out.println("Can Delta cua phuong trinh la: " + canDelta);
    }

    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien su dung: ");
        double soDien = scanner.nextDouble();

        double giaTien;
        if (soDien <= 50) {
            giaTien = soDien * 1500;
        } else {
            giaTien = 50 * 1500 + (soDien - 50) * 2000;
        }

        System.out.println("So tien dien can thanh toan la: " + giaTien);
    }
}


import java.util.Scanner;
public class CongTyCaNhac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong ca sy chua noi tieng: ");
        int soLuongCaSyChuaNoiTieng = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap so luong ca sy noi tieng: ");
        int soLuongCaSyNoiTieng = scanner.nextInt();
        scanner.nextLine();

        CaSy[] danhSachCaSy = new CaSy[soLuongCaSyChuaNoiTieng + soLuongCaSyNoiTieng];

        for (int i = 0; i < soLuongCaSyChuaNoiTieng; i++) {
            System.out.println("Nhap thong tin ca sy chua noi tieng thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();

            System.out.print("So nam lam viec: ");
            int soNamLamViec = scanner.nextInt();

            System.out.print("So dia ban duoc: ");
            int soDiaBanDuoc = scanner.nextInt();

            System.out.print("So buoi trinh dien: ");
            int soBuoiTrinhDien = scanner.nextInt();

            danhSachCaSy[i] = new CaSyChuaNoiTieng(hoTen, soNamLamViec, soDiaBanDuoc, soBuoiTrinhDien);

            scanner.nextLine();
        }

        for (int i = 0; i < soLuongCaSyNoiTieng; i++) {
            System.out.println("Nhap thong tin ca sy noi tieng thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();

            System.out.print("So nam lam viec: ");
            int soNamLamViec = scanner.nextInt();

            System.out.print("So dia ban duoc: ");
            int soDiaBanDuoc = scanner.nextInt();

            System.out.print("Sobuoi trinh dien: ");
            int soBuoiTrinhDien = scanner.nextInt();

            System.out.print("So gameshow tham gia: ");
            int soGameShowThamGia = scanner.nextInt();

            danhSachCaSy[soLuongCaSyChuaNoiTieng + i] = new CaSyNoiTieng(hoTen, soNamLamViec, soDiaBanDuoc, soBuoiTrinhDien, soGameShowThamGia);

            scanner.nextLine();
        }

        System.out.println("Thong tin cua cac ca sy:");
        for (CaSy caSy : danhSachCaSy) {
            System.out.println(caSy);
        }

        double luongCaoNhat = 0;
        CaSy caSyLuongCaoNhat = null;

        for (CaSy caSy : danhSachCaSy) {
            if (caSy.tinhLuong() > luongCaoNhat) {
                luongCaoNhat = caSy.tinhLuong();
                caSyLuongCaoNhat = caSy;
            }
        }

        if (caSyLuongCaoNhat != null) {
            System.out.println("Ca sy co muc luong cao nhat la:");
            System.out.println(caSyLuongCaoNhat);
        }

        scanner.close();
    }
}
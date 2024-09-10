import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHoaDon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<KhachHang> danhSachHoaDon = new ArrayList<>();

        // Nhập danh sách hóa đơn từ người dùng
        System.out.print("Nhap so luong hoa don: ");
        int soLuongHoaDon = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        for (int i = 0; i < soLuongHoaDon; i++) {
            System.out.println("Nhap thong tin hoa don thu " + (i + 1) + ":");
            System.out.print("Loai khach hang (1 - Viet Nam, 2 - Nuoc ngoai): ");
            int loaiKhachHang = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            System.out.print("Ma khach hang: ");
            String maKhachHang = scanner.nextLine();

            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();

            System.out.print("Ngay ra hoa don (ngay, thang, nam): ");
            int ngay = scanner.nextInt();
            int thang = scanner.nextInt();
            int nam = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line
            NgayThang ngayRaHoaDon = new NgayThang(ngay, thang, nam);

            if (loaiKhachHang == 1) {
                System.out.print("Doi tuong khach hang (sinh hoat, kinh doanh, san xuat): ");
                String doiTuong = scanner.nextLine();

                System.out.print("So luong (so KW tieu thu): ");
                int soLuong = scanner.nextInt();

                System.out.print("Don gia: ");
                double donGia = scanner.nextDouble();

                System.out.print("Dinh muc: ");
                int dinhMuc = scanner.nextInt();

                KhachHangVietNam khachHangVietNam = new KhachHangVietNam(maKhachHang, hoTen, ngayRaHoaDon, doiTuong, soLuong, donGia, dinhMuc);
                danhSachHoaDon.add(khachHangVietNam);
            } else if (loaiKhachHang == 2) {
                System.out.print("Quoc tich: ");
                String quocTich = scanner.nextLine();

                System.out.print("So luong: ");
                int soLuong = scanner.nextInt();

                System.out.print("Don gia: ");
                double donGia = scanner.nextDouble();
                KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(maKhachHang, hoTen, ngayRaHoaDon, quocTich, soLuong, donGia);
                danhSachHoaDon.add(khachHangNuocNgoai);
            } else {
                System.out.println("Loai khach hang khong hop le. Vui long nhap lai");
                i--; // Quay lại nhập lại thông tin hóa đơn
            }

            scanner.nextLine(); // Đọc bỏ dòng new line
        }

        System.out.println("Danh sach hoa don trong thang 09 nam 2013:");
        for (KhachHang hoaDon : danhSachHoaDon) {
            if (hoaDon.namRaHoaDon.thang == 9 && hoaDon.namRaHoaDon.nam == 2013) {
                System.out.println(hoaDon.toString());
            }
        }

        // Tính tổng số lượng cho từng loại khách hàng
        int tongSoLuongVietNam = 0;
        int tongSoLuongNuocNgoai = 0;

        for (KhachHang hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangVietNam) {
                tongSoLuongVietNam++;
            } else if (hoaDon instanceof KhachHangNuocNgoai) {
                tongSoLuongNuocNgoai++;
            }
        }

        System.out.println("Tong so luong khach hang Viet Nam: " + tongSoLuongVietNam);
        System.out.println("Tong so luong khach hang nuoc ngoai: " + tongSoLuongNuocNgoai);

        // Tính trung bình thành tiền của khách hàng người nước ngoài
        int countNuocNgoai = 0;
        double tongThanhTienNuocNgoai = 0;

        for (KhachHang hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                countNuocNgoai++;
                tongThanhTienNuocNgoai += hoaDon.tinhThanhTien();
            }
        }

        if (countNuocNgoai > 0) {
            double trungBinhThanhTienNuocNgoai = tongThanhTienNuocNgoai / countNuocNgoai;
            System.out.println("Trung binh thanh tien cua khach hang nguoi nuoc ngoai: " + trungBinhThanhTienNuocNgoai);
        } else {
            System.out.println("Khong co khach hang nguoi nuoc ngoai trong danh sach.");
        }
    }
}
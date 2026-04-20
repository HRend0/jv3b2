import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dem = 0;
        double tong = 0;
        double max = -1;
        double min = 11;
        int chon;

        do {
            System.out.println("\n********* MENU NHẬP ĐIỂM **********");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    while (true) {
                        System.out.print("Nhập điểm điểm học viên (nhập -1 để dừng): ");
                        double diem = sc.nextDouble();
                        if (diem == -1) break;
                        if (diem < 0 || diem > 10) {
                            System.out.println("Điểm không hợp lệ, nhập lại!");
                            continue;
                        }

                        dem++;
                        tong += diem;
                        if (diem > max) max = diem;
                        if (diem < min) min = diem;

                        String xeploai = "";
                        if (diem < 5) xeploai = "Yếu";
                        else if (diem < 7) xeploai = "Trung bình";
                        else if (diem < 8) xeploai = "Khá";
                        else if (diem < 9) xeploai = "Giỏi";
                        else xeploai = "Xuất sắc";

                        System.out.println("Học lực: " + xeploai);
                    }
                    break;

                case 2:
                    if (dem == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("\n--- KẾT QUẢ ---");
                        System.out.println("Số học viên đã nhập: " + dem);
                        System.out.printf("Điểm trung bình: %.2f\n", (tong / dem));
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;

                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 3);
        sc.close();
    }
}
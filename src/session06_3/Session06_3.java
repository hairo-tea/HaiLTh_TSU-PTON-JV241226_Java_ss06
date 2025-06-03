package session06_3;

import java.util.Scanner;

public class Session06_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cntLicensePlate = new String[50]; //giả sử số lượng biển số xe tối đa là 50
        int currentIndex = 0; //Biến đếm số biển số được nhập vào

        do {
            System.out.println("***************QUẢN LÝ BIỂN SỐ XE**************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe ");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    //cho phép nhập mỗi lần 5 biến số xe
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thêm các biển số xe: ");
                        String licensePlate = scanner.nextLine();
                        cntLicensePlate[currentIndex] = licensePlate;
                        currentIndex++;
                    }
                    break;
                case 2:
                    System.out.println("Danh sách biển số xe:");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.println(cntLicensePlate[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Nhập vào biển số xe cần tìm kiếm: ");
                    String userInputPlate = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < currentIndex; i++) {
                        if (userInputPlate.equalsIgnoreCase(cntLicensePlate[i])) {
                            System.out.println("Tìm thấy biển số xe: " + cntLicensePlate[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy biển số xe");
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào mã tỉnh cần tìm kiếm : ");
                    String inputProvinceCode = scanner.nextLine();
                    boolean foundProvince = false;
                    for (int i = 0; i < currentIndex; i++) {
                        //cắt chuỗi lấy 2 phần tử đầu
                        String provinceCode = cntLicensePlate[i].substring(0, 2);
                        if (provinceCode.equals(inputProvinceCode)) {
                            System.out.println(cntLicensePlate[i]);
                            foundProvince = true;
                        }
                    }
                    if (!foundProvince) {
                        System.out.println("Không tìm thấy mã tỉnh");
                    }
                    break;
                case 5://Sắp xếp biển số xe tăng dần theo mã tỉnh và theo thứ tự từ điển
                    for (int i = 0; i < currentIndex; i++) {
                        for (int j = i + 1; j < currentIndex; j++) {
                            //so sánh chuỗi bỏ qua chữ hoa/thường
                            //Nếu i đứng sau j trong bảng chữ cái
                            if (cntLicensePlate[i].compareToIgnoreCase(cntLicensePlate[j]) > 0) {
                                // thì đổi chỗ
                                String temp = cntLicensePlate[i];
                                cntLicensePlate[i] = cntLicensePlate[j];
                                cntLicensePlate[j] = temp;
                            }
                        }
                    }
                    System.out.println("Danh sách biển số sau khi sắp xếp tăng dần:");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.println(cntLicensePlate[i]);
                    }
                    break;
                case 6:
                    System.exit(0);
                    System.out.println("Kết thúc chươnng trình");
                    break;
                default:
                    System.err.println("Vui lòng nhập lựa chọn đúng từ 1-6");
            }

        } while (true);
    }
}


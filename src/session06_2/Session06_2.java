package session06_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Session06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = "";
        String email = "";
        String phone = "";
        String password = "";

        do {
            System.out.println("******************QUẢN LÝ NGƯỜI DÙNG****************");
            System.out.println("1.Nhập thông tin người dùng");
            System.out.println("2.Chuẩn hóa họ tên");
            System.out.println("3.Kiểm tra email hợp lệ");
            System.out.println("4.Kiểm tra số điện thoại hợp lệ");
            System.out.println("5.Kiểm tra mật khẩu hợp lệ");
            System.out.println("6.Thoát");

            System.out.print("\nLựa chọn của bạn: ");
            int select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    System.out.println("Nhập Họ và tên: ");
                    fullName = sc.nextLine().trim();
                    System.out.println("Nhập email: ");
                    email = sc.nextLine().trim();
                    System.out.println("Nhập số điện thoại: ");
                    phone = sc.nextLine().trim();
                    System.out.println("Nhập mật khẩu: ");
                    password = sc.nextLine().trim();
                    break;
                case 2:
                    //chuẩn hóa họ tên
                    String fullNameSort = fullName.trim().replaceAll("\\s+", " "); //cắt khoảng trắng 2 đầu
                    //cắt chuỗi thành mảng gốc gồm các phần tử là các từ
                    String[] arrayFullName = fullNameSort.split(" ");
                    //chuẩn hóa tên
                    //Cộng các phần tử thành chuỗi chuẩn hóa
                    StringBuilder stringStandard = new StringBuilder("");
                    for (int i = 0; i < arrayFullName.length; i++) {
                        stringStandard.append(Character.toUpperCase(arrayFullName[i].charAt(0)))  //Viết hoa chữ cái đầu mỗi từ
                                .append(arrayFullName[i].substring(1).toLowerCase()) //giữ phần còn lại
                                .append(" "); // thêm khoảng trắng sau mỗi từ
                    }
                    System.out.println("Họ tên sau chuẩn hóa: " + stringStandard.toString().toString().trim()); //chuyển thành chuỗi thường và  in không có khoảng trắng
                    break;
                case 3:
                    String emailRegex = "[a-zA-Z\\d.-]{3,}@[a-zA-Z\\d]{5,}.[a-zA-Z]{2,3}";
                    if (Pattern.matches(emailRegex, email)) {
                        System.out.println("Email hợp lệ");
                    } else {
                        System.out.println("Email không hợp lệ");
                    }
                    break;
                case 4:
                    String phoneRegex = "(\\+84|09|08|03)(0|1|2|5|8)\\d{7}";
                    if (Pattern.matches(phoneRegex, phone)) {
                        System.out.println("Số điện thoại hợp lệ");
                    } else {
                        System.out.println("Số điện thoại không hợp lệ");
                    }
                    break;
                case 5:
                    String passRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[!@#$%&*])[a-zA-Z\\d!@#$%&*]{8,}";
                    if (Pattern.matches(passRegex, password)) {
                        System.out.println("Mật khẩu hợp lệ");
                    } else {
                        System.out.println("Mật khẩu không hợp lệ");
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }
        } while (true);
    }
}


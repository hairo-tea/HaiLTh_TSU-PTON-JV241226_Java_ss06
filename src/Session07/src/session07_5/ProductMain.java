package session07_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    //danh sách để quản lý các đối tượng Product
    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu: ");
            System.out.println("1.Thêm mới sản phẩm ");
            System.out.println("2.Hiển thị danh sách sản phẩm ");
            System.out.println("3.Cập nhật sản phẩm ");
            System.out.println("4.Xóa sản phẩm ");
            System.out.println("5.Thoát ");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    //cho người dùng nhập sản phẩm thỏa thích, nhập -1 thì dừng
                    String id;
                    do {
                        System.out.print("Nhập ID sản phẩm (nhập -1 để dừng): ");
                        id = sc.nextLine();
                        if (id.equals("-1")) break;

                        System.out.print("Nhập tên sản phẩm: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập giá sản phẩm: ");
                        double price = Double.parseDouble(sc.nextLine());
                        //Thêm sp vào danh sách
                        productList.add(new Product(id, name, price));
                        System.out.println("Sản phẩm đã được thêm.");
                    } while (true);
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm:");
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() + ", name: " + product.getName() + ", price: " + product.getPrice());
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    String updateId = sc.nextLine();
                    boolean found = false;
                    for (Product product : productList) {
                        if (product.getId().equals(updateId)) {
                            System.out.print("Nhập tên mới: ");
                            product.setName(sc.nextLine());
                            System.out.print("Nhập giá mới: ");
                            product.setPrice(Float.parseFloat(sc.nextLine()));
                            found = true;
                            System.out.println("Sản phẩm đã được cập nhật ");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ID không tồn tại.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    String deleteId = sc.nextLine();
                    found = false;
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getId().equals(deleteId)) {
                            productList.remove(i);
                            found = true;
                            System.out.println("Sản phẩm đã được xóa.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ID không tồn tại.");
                    }
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (true);
    }
}

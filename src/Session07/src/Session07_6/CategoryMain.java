package Session07_6;

import session07_5.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryMain {
    public static List<Category> categories = new ArrayList<Category>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu: ");
            System.out.println("1.Thêm mới danh mục ");
            System.out.println("2.Hiển thị danh sách sản phẩm ");
            System.out.println("3.Cập nhật danh mục ");
            System.out.println("4.Xóa danh mục ");
            System.out.println("5.Tìm kiếm danh mục theo tên ");
            System.out.println("6.Thoát ");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    //cho người dùng nhập sản phẩm thỏa thích, nhập -1 thì dừng
                    String id;
                    do {
                        System.out.print("Nhập ID danh mục (nhập -1 để dừng): ");
                        id = sc.nextLine();
                        if (id.equals("-1")) break;

                        System.out.print("Nhập tên danh mục: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập mô tả danh mục: ");
                        String description = sc.nextLine();
                        //Thêm vào danh sách lưu trữ danh mục
                        categories.add(new Category(id, name, description));
                        System.out.println("Danh mục đã được thêm.");
                    } while (true);
                    break;
                case 2:
                    System.out.println("Danh sách danh mục:");
                    for (Category category : categories) {
                        System.out.println("ID: " + category.getId() + ", Name: " + category.getName() + ", Description: " + category.getDescription());
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    String updateId = sc.nextLine();
                    boolean found = false;
                    for (Category category : categories) {
                        if (category.getId().equals(updateId)) {
                            System.out.print("Nhập tên mới: ");
                            category.setName(sc.nextLine());
                            System.out.print("Nhập mô tả mới: ");
                            category.setDescription(sc.nextLine());
                            found = true;
                            System.out.println("Danh mục đã được cập nhật ");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ID không tồn tại.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    String deleteId = sc.nextLine();
                    found = false;
                    for (int i = 0; i < categories.size(); i++) {
                        if (categories.get(i).getId().equals(deleteId)) {
                            categories.remove(i);
                            found = true;
                            System.out.println("Danh mục đã được xóa.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ID không tồn tại.");
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên danh mục cần tìm: ");
                    String seachName = sc.nextLine();
                    boolean seachFound = false;
                    for (Category category : categories) {
                        if (category.getName().toLowerCase().contains(seachName.toLowerCase())) {
                            System.out.println("ID: " + category.getId() + ", Name: " + category.getName() + ", Description: " + category.getDescription());
                            seachFound = true;
                        }
                    }
                    if (!seachFound) {
                        System.out.println("Không tìm thấy danh mục nào khớp với tên.");
                    }
                    break;
                case 6:
                    System.out.println("Thoát khỏi chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (true);
    }
}

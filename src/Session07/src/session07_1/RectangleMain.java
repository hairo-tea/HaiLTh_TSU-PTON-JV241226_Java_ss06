package session07_1;

public class RectangleMain {
    public static void main(String[] args) {
        //Tạo đối tượng Rectangle với constructor mặc định
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Hình chữ nhật 1: ");
        rectangle1.display();

        //Tạo đối tượng Rectangle với constructor có tham số
        Rectangle rectangle2 = new Rectangle(5, 3);
        System.out.println("\nHình chữ nhật 2: ");
        rectangle2.display();
    }
}

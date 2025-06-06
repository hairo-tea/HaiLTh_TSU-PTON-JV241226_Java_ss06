package session07_2;

public class BookMain {
    public static void main(String[] args) {
        //Khởi tạo đối tượng Book
        Book myBook = new Book();
        //truy cập các thuộc tính qua các phương thức setter
        myBook.setTitle("Java Book");
        myBook.setAuthor("James Bond");


        myBook.setPrice((float) 29.99);

        //Hiển thị thông tin sách
        System.out.println("Tiêu đề: " + myBook.getTitle());
        System.out.println("Tác giả: " + myBook.getAuthor());
        System.out.println("Giá: " + myBook.getPrice());

        //thay đổi giá trị của thuộc tính price thông qua phương thức setter và kiểm tra tính chính xác
        myBook.setPrice((float) 35.50); //giá hợp lệ
        System.out.println("Giá mới: " + myBook.getPrice());

        myBook.setPrice((float) -5.00); //giá không hợp lệ
    }
}

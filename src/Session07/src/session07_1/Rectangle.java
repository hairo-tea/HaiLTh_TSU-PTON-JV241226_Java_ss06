package session07_1;

public class Rectangle {
    private double length;
    private double width;

    //Constructor mặc định
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    //Constructor có tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Mehod tính diện tích
    public double getArea() {
        return length * width;
    }

    //Method tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    //Method Hiển thị thông tin
    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}

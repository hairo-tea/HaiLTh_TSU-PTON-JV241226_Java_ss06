package session07_4;

import java.util.Scanner;

public class Student {
    //Tạo lớp Student với các thuộc tính
    private String name;
    private int age;
    private String className;
    private double avgScore;

    //Hàm tạo Constructor
    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }
    
    public double getAvgScore() {
        return avgScore;
    }

    //Hiển thị
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age + ", Lớp: " + className + ", Điểm trung bình: " + avgScore;
    }
}

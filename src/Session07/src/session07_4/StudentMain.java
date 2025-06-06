package session07_4;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        //Tạo một danh sách có sẵn các đối tượng Student.
        Student[] studentArr = new Student[6];
        studentArr[0] = new Student("Bob", 20, "A1", 7.8);
        studentArr[1] = new Student("John", 22, "A2", 8.8);
        studentArr[2] = new Student("Jame", 20, "A1", 9.0);
        studentArr[3] = new Student("Ted", 21, "A1", 7.7);
        studentArr[4] = new Student("Jay", 22, "A2", 6.9);
        studentArr[5] = new Student("Nancy", 21, "A2", 8.0);


        //Yêu cầu người dùng nhập vào điểm min và max.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm min: ");
        double minScore = sc.nextDouble();
        System.out.print("Nhập vào điểm max: ");
        double maxScore = sc.nextDouble();
        //Hiển thị danh sách các sinh viên có điểm avgScore trong khoảng từ min đến max.
        System.out.println("Danh sách các sv có điểm trung bình trong khoảng từ " + minScore + " đến " + maxScore + ":");
        for (Student student : studentArr) {
            if (student.getAvgScore() >= minScore && student.getAvgScore() <= maxScore) {
                System.out.println(student);
            }
        }

    }
}

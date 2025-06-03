package session06_1;

import java.util.Scanner;

public class Session06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] scoreStudents = new float[100];//giả sử có thể nhập tối đa 100 sv
        int currentIndex = 0; //khai báo chỉ số được nhập vào
        do {
            System.out.println("******************QUẢN LÝ ĐIỂM SV****************");
            System.out.println("1. Nhập danh sách điểm sinh viên: ");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int selected = Integer.parseInt(sc.nextLine());

            switch (selected) {
                case 1:
                    // Mỗi lần nhập 3 điểm
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Nhập điểm học viên: ");
                        float score = Float.parseFloat(sc.nextLine());
                        //Nếu nhập sai định dạng điểm thì hiển thị thông báo
                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ. Nhập lại.");
                            continue;
                        }
                        scoreStudents[currentIndex] = score;
                        currentIndex++;
                    }
                    break;
                case 2:
                    if (currentIndex == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("\nDanh sách điểm: ");
                        for (int i = 0; i < currentIndex; i++) {
                            System.out.printf("%.1f  ", scoreStudents[i]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    float sumScore = 0; // Biến lưu tổng số điểm sv đã nhập
                    for (int i = 0; i < currentIndex; i++) {
                        sumScore += scoreStudents[i];
                    }
                    System.out.printf("\nĐiểm trung bình của sinh viên:%.1f\n ", sumScore / currentIndex);
                    break;
                case 4:
                    float minScore = scoreStudents[0];
                    float maxScore = scoreStudents[0];

                    if (currentIndex == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        for (int i = 1; i < currentIndex; i++) {
                            if (scoreStudents[i] < minScore) {
                                minScore = scoreStudents[i];
                            }
                            if (scoreStudents[i] > maxScore) {
                                maxScore = scoreStudents[i];
                            }
                        }
                        System.out.printf("\nĐiểm cao nhất: %.1f\n ", maxScore);
                        System.out.printf("Điểm thấp nhất: %.1f\n ", minScore);
                    }
                    break;
                case 5:
                    float passStudents = 0; //đếm số sinh viên đỗ
                    float failStudents = 0; //đếm số sinh viên trượt
                    if (currentIndex == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        for (int i = 0; i < currentIndex; i++) {
                            if (scoreStudents[i] >= 5) {
                                passStudents++;
                            } else {
                                failStudents++;
                            }
                        }
                        System.out.printf("\nSố lượng sinh viên đạt (>=5):%.0f\n ", passStudents);
                        System.out.printf("Số lượng sinh viên trượt (<5):%.0f\n ", failStudents);
                    }
                    break;
                case 6:
                    if (currentIndex == 0) {
                        System.out.println("Chưa có dữ liệu.");
                    } else {
                        System.out.println("Danh sách điểm tăng dần:");
                        for (int i = 0; i < currentIndex - 1; i++) {
                            for (int j = i + 1; j < currentIndex; j++) {
                                if (scoreStudents[i] > scoreStudents[j]) {
                                    //Đổi chỗ
                                    float temp = scoreStudents[i];
                                    scoreStudents[i] = scoreStudents[j];
                                    scoreStudents[j] = temp;
                                }
                            }
                        }
                        // In sau khi đã sắp xếp
                        for (int i = 0; i < currentIndex; i++) {
                            System.out.printf("%.1f ", scoreStudents[i]);
                        }
                        System.out.println();
                    }
                    break;
                case 7:  //Thống kê số lượng sinh viên giỏi và xuất sắc
                    if (currentIndex == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        int goodStudents = 0;
                        for (int i = 0; i < currentIndex; i++) {
                            if (scoreStudents[i] >= 8) goodStudents++;
                        }
                        System.out.println("\nSố sinh viên giỏi và xuất sắc: " + goodStudents);
                    }
                    break;
                case 8:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (true);
    }
}




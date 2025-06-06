package session07_3;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();

        //đối tương 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên người thứ nhất: ");
        person1.setName(sc.nextLine());
        System.out.println("Nhập tuổi người thứ nhất: ");
        person1.setAge(sc.nextInt());
        sc.nextLine();

        //đối tượng 2
        Person person2 = new Person();
        System.out.println("Nhập tên người thứ hai: ");
        person2.setName(sc.nextLine());
        System.out.println("Nhập tuổi người thứ hai: ");
        person2.setAge(sc.nextInt());

        //So sánh tuổi của hai đối tượng và in ra ai lớn tuổi hơn.
        if (person1.getAge() > person2.getAge()) {
            System.out.println(person1.getName() + " lớn tuổi hơn " + person2.getName());
        } else if (person2.getAge() > person1.getAge()) {
            System.out.println(person1.getName() + " nhỏ tuổi hơn " + person2.getName());
        } else {
            System.out.println("Cả hai bằng tuổi");
        }
    }
}

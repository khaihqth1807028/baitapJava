//package main;
//
//import controller.ApplicationController;
//import controller.EmployeeController;
//import controller.StudentController;
//import entity.*;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bạn muốn quản lý sinh viên hay nhân viên:");
//        System.out.println("1. Sinh viên.");
//        System.out.println("2. Nhân viên.");
//        System.out.println("3. Muốn về.");
//        System.out.println("Vui lòng nhập lựa chọn của bạn: ");
//        int choice = scanner.nextInt();
//        scanner.nextLine();
//        ApplicationController controller = null;
//        switch (choice) {
//            case 1:
//                controller = new StudentController();
//                System.out.println("Quản lý sinh viên");
//                break;
//            case 2:
//                controller = new EmployeeController();
//                System.out.println("Quản lý nhân viên");
//                break;
//            case 3:
//                System.out.println("Hẹn gặp lại tại kỳ thi...lại!");
//                System.exit(1);
//                break;
//            default:
//                System.out.println("Lựa chọn sai. Vui lòng nhập số từ 1 đến 3.");
//                break;
//        }
//        controller.add();
//        controller.printList();
//    }
//}
package main;
import controller.ApplicationController;
import controller.foodController;
import controller.foodController;

import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("==============Khai ho Food ================= ");
          System.out.println("vui lòng nhập lựa chọn ");
          System.out.println("(1) nhap thong tin food ");
          System.out.println("(2) ket thuc");
          System.out.println("ban chon :");
          int choice= scanner.nextInt();
          scanner.nextLine();
          ApplicationController controller = null;
          switch (choice){
              case 1:
               controller = new foodController();
                  System.out.println("bạn chọn nhap thong tin");
                  break;
              case 2:
                  System.out.println("ko xem j ca");
                  break;
                  default:
                      System.out.println("bạn nhập ko đung , vui log nhập lại từ 1-2");
                      break;
          }
          controller. add();
          controller. printFood();
      }
  }
//    public static void main(String[] args) {
//        // khởi tạo đối tượng cụ thể của lớp StudentController.
//        // create an instance object of StudentController;
//        // Tạo một biến kiểu StudentController tên là controller. bla bla.
//        StudentController controller = new StudentController();
//        controller.addStudent();
//        controller.addStudent();
//        controller.printStudent();
//    }

//    public static void main(String[] args) {
//        MenuGenerator menuCuaToi = new MenuGenerator();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập quyền truy cập: ");
//        System.out.println("1. Sinh viên.");
//        System.out.println("2. Giáo vụ.");
//        int role = scanner.nextInt();
//        switch (role) {
//            case 1:
//                menuCuaToi.generateStudentMenu();
//                break;
//            case 2:
//                menuCuaToi.generateEmployeeMenu();
//                break;
//            default:
//                System.out.println("Sai thông tin quyền.");
//                break;
//        }
//    }

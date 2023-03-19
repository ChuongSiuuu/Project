package Signin;

import java.util.Scanner;

public class Signin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 3;
        String userName, password;
        boolean isLogin = false;
        while (count != 0) {
            count = count - 1;
            System.out.print("Nhập username:");
            userName = in.nextLine();
            System.out.print("Nhập password: ");
            password = in.nextLine();
            // Kiem tra mat khau
            if (userName.equals("admin") && password.equals("admin")) {
                isLogin = true;
                break;
            }
            System.out.printf("Bạn còn %d lần nhập!\n", count);
        }
        if (!isLogin) {
            System.out.println("Đăng nhập thất bại");
        } else {
            System.out.println("Đăng nhập thành công");
        }
    }
}




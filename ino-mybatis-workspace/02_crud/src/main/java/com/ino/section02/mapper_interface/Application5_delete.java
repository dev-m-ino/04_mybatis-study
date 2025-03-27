package com.ino.section02.mapper_interface;

import java.util.Scanner;

public class Application5_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuService ms = new MenuService();
        String code = sc.nextLine();
        ms.deleteMenu(Integer.parseInt(code));
    }
}

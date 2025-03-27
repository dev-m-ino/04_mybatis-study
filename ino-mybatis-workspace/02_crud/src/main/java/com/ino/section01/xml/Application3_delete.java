package com.ino.section01.xml;

import java.util.Scanner;

public class Application3_delete {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        Scanner sc = new Scanner(System.in);
        System.out.println("edit menu num: ");
        String num = sc.nextLine();
        menuService.deleteMenu(Integer.parseInt(num));
    }
}

package com.ino.section01.xml;

import com.ino.dto.MenuDto;

import java.util.Scanner;

public class Application5_SelectOne {
    public static void main(String[] args) {
        MenuService ms = new MenuService();
        System.out.println(ms.selectOrderableMenuCount());

        Scanner sc = new Scanner(System.in);
//        System.out.print("menu num: ");
//        String code = sc.nextLine();
        MenuDto menu = ms.selectMenuByCode(10);
        System.out.println(menu.toString());
    }
}

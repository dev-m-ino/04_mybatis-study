package com.ino.section02.mapper_interface;

import com.ino.dto.MenuDto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MenuService ms = new MenuService();
//
//        for (MenuDto m : ms.selectMenu()) {
//            System.out.println(m.toString());
//        }
//        System.out.println(ms.selectMenuByCode(10));
        Scanner sc = new Scanner(System.in);
        System.out.print("input price: ");
        String price = sc.nextLine();
        System.out.println(ms.countUnderCost(Integer.parseInt(price)));
    }
}

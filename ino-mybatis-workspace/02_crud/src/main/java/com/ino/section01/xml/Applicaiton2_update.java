package com.ino.section01.xml;

import com.ino.dto.MenuDto;

import java.util.List;
import java.util.Scanner;

public class Applicaiton2_update {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        Scanner sc = new Scanner(System.in);
        System.out.println("edit menu num: ");
        String num = sc.nextLine();
        System.out.println("menu name: ");
        String name = sc.nextLine();
        System.out.println("menu price: ");
        String price = sc.nextLine();
        System.out.println("cate num: ");
        String category = sc.nextLine();
        System.out.println("orderable: ");
        String orderable = sc.nextLine().toUpperCase();

        MenuDto menu = new MenuDto(Integer.parseInt(num), name, Integer.parseInt(price), Integer.parseInt(category), orderable);
        menuService.updateMenu(menu);
//        List<MenuDto> list = menuService.selectCateNum2();
//        for(MenuDto m : list) {
//            System.out.println(m.toString());
//        }
    }
}

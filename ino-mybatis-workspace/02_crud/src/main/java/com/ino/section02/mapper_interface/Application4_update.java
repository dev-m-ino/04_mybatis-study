package com.ino.section02.mapper_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application4_update {
    public static void main(String[] args) {
        MenuService ms = new MenuService();
        Map<String, String> menuMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("change menu code: ");
        menuMap.put("menuCode", sc.nextLine());
        System.out.print("categoryCode: ");
        menuMap.put("categoryCode", sc.nextLine());
        System.out.print("menuName: ");
        menuMap.put("menuName", sc.nextLine());
        System.out.print("menuPrice: ");
        menuMap.put("menuPrice", sc.nextLine());
        System.out.print("orderableStatus: ");
        menuMap.put("orderableStatus", sc.nextLine());
        ms.updateMenu(menuMap);
    }
}

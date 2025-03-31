package com.ino.run;

import com.ino.service.MenuService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("edit menu name(mandatory): ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("edit menuname(not mandatory): ");
        String name = sc.nextLine();
        System.out.print("edit cate num(not mandatory): ");
        String category = sc.nextLine();
        System.out.print("edit orderable(not mandatory): ");
        String orderable = sc.nextLine().toUpperCase();

        Map<String, Object> searchMap = Map.of("code", code, "name", name, "category", category, "orderable", orderable);

        int result = new MenuService().updateMenu(searchMap);


    }
}

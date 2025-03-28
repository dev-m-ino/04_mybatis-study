package com.ino.run;

import com.ino.service.MenuService;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        MenuService ms = new MenuService();
        System.out.println(ms.selectMenuByCode(Integer.parseInt(code)).toString());
    }

}

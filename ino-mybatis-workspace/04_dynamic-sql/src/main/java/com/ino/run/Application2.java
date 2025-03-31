package com.ino.run;

import com.ino.service.MenuService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> deleteMenuCodes = new ArrayList<>();

        while(true) {
            System.out.print("삭제할 메뉴번호: ");
            deleteMenuCodes.add(Integer.parseInt(sc.nextLine()));

            System.out.print("그만 입력 하시겠습니까?: ");

            if (sc.nextLine().toUpperCase().equals("Y")) {
                break;
            }
        }
        int result = new MenuService().deleteMenu(deleteMenuCodes);

        System.out.println(result);
    }
}

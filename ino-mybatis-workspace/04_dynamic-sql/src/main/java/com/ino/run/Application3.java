package com.ino.run;

import com.ino.dto.MenuDto;
import com.ino.service.MenuService;

import java.util.List;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색 기능 사용?: ");
        int menuCode = 0;
        switch (sc.nextLine().toUpperCase().charAt(0)) {
            case 'Y':
                System.out.print("input number: ");
                menuCode = sc.nextInt();
                break;
            case 'N':
                break;
            default:
                System.out.println("wrong input");
        }
        List<MenuDto> list = new MenuService().selectMenuByCodeOrSearchAll(menuCode);
        for (MenuDto menuDto : list) {
            System.out.println(menuDto.toString());
        }
    }
}

package com.ino.run;

import com.ino.dto.MenuDto;
import com.ino.service.MenuService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                1. 메뉴명으로 키워드 검색:
                2. 카테고리 명으로 검색
                >> 입력: """);
        String condition = sc.nextInt() == 1 ? "name" : "category";
        sc.nextLine();

        System.out.print(">> 검색어: ");
        String value = sc.nextLine();

        // controller단 로직
        Map<String, String> searchMap = new HashMap<>();
        searchMap.put("condition", condition);

        searchMap.put("value", value);

        List<MenuDto> searchList1 =  new MenuService().selectMenuByNameOrCategory1(searchMap);
        for (MenuDto menuDto : searchList1) {
            System.out.println(menuDto.toString());
        }
    }
}

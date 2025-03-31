package com.ino.run;

import com.ino.dto.MenuDto;
import com.ino.service.MenuService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        // search option(name, cate, both, none) -> value -> request
        Scanner sc = new Scanner(System.in);
        System.out.print("search option(name, category, both, none) : ");
        String condition = sc.nextLine();
        Map<String, Object> searchMap = new HashMap<>();
        searchMap.put("condition", condition);
        if ("name".equals(condition)) {
            System.out.print("검색 메뉴명: ");
            searchMap.put("name", sc.nextLine());
        } else if ("category".equals(condition)) {
            System.out.print("검색 메뉴 카테고리 번호: ");
            searchMap.put("category", sc.nextLine());
        } else if ("both".equals(condition)) {
            System.out.print("검색 메뉴명 : ");
            searchMap.put("name", sc.nextLine());
            System.out.print("검색 메뉴 카테고리 번호: ");
            searchMap.put("category", sc.nextLine());
        }
        List<MenuDto> list = new MenuService().selectMenuByNameOrCategory2(searchMap);
        for (MenuDto menuDto : list) {
            System.out.println(menuDto.toString());
        }
    }
}

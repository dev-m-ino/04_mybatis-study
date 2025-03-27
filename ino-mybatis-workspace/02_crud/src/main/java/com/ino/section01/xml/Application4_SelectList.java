package com.ino.section01.xml;

import com.ino.dto.MenuDto;

import java.util.List;

public class Application4_SelectList {
    public static void main(String[] args) {
        // 1. 전체 메뉴 메뉴명 조회
        MenuService menuService = new MenuService();
//        List<String> list = menuService.selectMenuNameList();
        List<MenuDto> list = menuService.selectMenuList();
        for (MenuDto s : list) {
            System.out.println(s.toString());
        }
    }
}

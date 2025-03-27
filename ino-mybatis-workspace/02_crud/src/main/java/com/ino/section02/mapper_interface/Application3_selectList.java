package com.ino.section02.mapper_interface;

import com.ino.dto.MenuDto;

import java.util.List;
import java.util.Scanner;

public class Application3_selectList {
    public static void main(String[] args) {
        // 카태고리명 -> 카테고리 메뉴 목록 조회
        Scanner sc = new Scanner(System.in);
        System.out.print("cate name: ");
        String category = sc.nextLine();
        List<MenuDto> list = new MenuService().selectMenuByCateogry(category);
        for (MenuDto m : list) {
            System.out.println(m.toString());
        }
    }
}

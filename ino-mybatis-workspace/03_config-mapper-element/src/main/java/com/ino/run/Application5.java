package com.ino.run;

import com.ino.dto.CategoryDto;
import com.ino.dto.MenuDto;
import com.ino.service.MenuService;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("신규 카테고리명: ");
        String cateName = sc.nextLine();
        System.out.print("신규 카테고리의 상위 카테고리번호: ");
        Integer refCateCode = sc.nextInt();
        sc.nextLine();
        System.out.print("신규 메뉴명: ");
        String menuName = sc.nextLine();

        System.out.print("메뉴 가격 입력: ");
        int menuPrice = sc.nextInt();
        sc.nextLine();  // 버퍼 비우기


        // 주문 가능 상태 입력
        System.out.print("주문 가능 상태 입력 (예: 'Y' 또는 'N'): ");
        String orderableStatus = sc.nextLine();
        // 신규 카테고리 등록하며 해당 번호를 통해 메뉴 추가
        CategoryDto category = CategoryDto.builder()
                                .categoryName(cateName)
                                .refCategoryCode(refCateCode)
                                .build();
        MenuDto menu = MenuDto.builder()
                                .menuName(menuName)
                                .menuPrice(menuPrice)
                                .orderableStatus(orderableStatus)
                                .categoryDto(category)
                                .build();
        MenuService ms = new MenuService();
        ms.insertMenuAndCategory(menu);
    }
}

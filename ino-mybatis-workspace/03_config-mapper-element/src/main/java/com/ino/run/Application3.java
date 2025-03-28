package com.ino.run;

import com.ino.dto.MenuDto;
import com.ino.dto.OrderDto;
import com.ino.service.MenuService;

import java.util.List;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        // orderCode -> OrderInfo(ordercode, ordetdate, ordertime, totalprice, ordermenu(menucode, quantity))
        MenuService ms = new MenuService();
        // getAllMenuList(번호, 메뉴명, 가격)
        Scanner sc = new Scanner(System.in);
        System.out.print("input num: ");
        String num = sc.nextLine();
        OrderDto od = ms.testResultMapCollection(Integer.parseInt(num));
        System.out.println(od.toString());
    }
}

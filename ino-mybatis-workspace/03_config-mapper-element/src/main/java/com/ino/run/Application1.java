package com.ino.run;

import com.ino.dao.MenuMapper;
import com.ino.dto.MenuDto;
import com.ino.service.MenuService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ino.common.Template.getSqlSession;

public class Application1 {
    public static void main(String[] args) {

        MenuService ms = new MenuService();
        // getAllMenuList(번호, 메뉴명, 가격)

        List<MenuDto> list = ms.getAllMenuCodeNamePrice();
        for (MenuDto menuDto : list) {
            System.out.println(menuDto.toString());
        }
        System.out.println("============================ div line ============================");
        // getAllMenuList(번호, 메뉴명, 가격, 카테고리, 주문가능여부)
        list = ms.getAllMenuList();
        for (MenuDto menuDto : list) {
            System.out.println(menuDto.toString());
        }

        System.out.println("============================ div line ============================");

        list = ms.testResultMapAssociation();

        for (MenuDto menuDto : list) {
            System.out.println(menuDto.toString());
        }
    }
}

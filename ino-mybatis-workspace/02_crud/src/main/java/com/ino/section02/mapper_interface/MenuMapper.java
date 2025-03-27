package com.ino.section02.mapper_interface;

import com.ino.dto.MenuDto;

import java.util.List;

public interface MenuMapper {
    int insertMenu(MenuDto menu);

    List<MenuDto> selectMenu();

    MenuDto selectMenuByCode(int code);

    int selectUnderCostCount(int price);

    List<MenuDto> selectMenuByCategory(String category);

    int updateMenuByCode(MenuDto menu);

    int deleteMenuByCode(int code);
}

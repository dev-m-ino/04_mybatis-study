package com.ino.dao;

import com.ino.dto.MenuDto;
import com.ino.dto.OrderDto;

import java.util.List;

public interface MenuMapper {

    List<MenuDto> getAllMenuCodeNamePrice();

    List<MenuDto> getAllMenuList();

    List<MenuDto> testResultMapAssociation();

    OrderDto testResultMapCollection(int code);

    MenuDto selectMenuByCode(int code);


    int insertCategory(MenuDto menu);

    int insertMenu(MenuDto menu);
}

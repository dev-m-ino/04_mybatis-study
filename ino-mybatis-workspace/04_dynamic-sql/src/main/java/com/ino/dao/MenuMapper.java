package com.ino.dao;

import com.ino.dto.MenuDto;

import java.util.List;
import java.util.Map;

public interface MenuMapper {

    List<MenuDto> selectMenuByNameOrCategory1(Map<String, String> searchMap);

    int deleteMenu(Map<String, Object> deleteMenuCodes);

    List<MenuDto> selectMenuByCodeOrSearchAll(int menuCode);

    List<MenuDto> selectMenuByNameOrCategory2(Map<String, Object> searchMap);

    int updateMenu(Map<String, Object> searchMap);
}

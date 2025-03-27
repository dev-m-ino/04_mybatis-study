package com.ino.section02.mapper_interface;

import com.ino.dto.MenuDto;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.ino.section01.xml.Template.getSqlSession;

public class MenuService {

    public int insertMenu(MenuDto menu){
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.insertMenu(menu);
        if(result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public List<MenuDto> selectMenu() {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.selectMenu();
        sqlSession.close();
        return list;
    }

    public MenuDto selectMenuByCode(int code) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        MenuDto menu = menuMapper.selectMenuByCode(code);
        sqlSession.close();
        return menu;
    }

    public int countUnderCost(int price) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.selectUnderCostCount(price);
        sqlSession.close();
        return result;
    }

    public List<MenuDto> selectMenuByCateogry(String category) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.selectMenuByCategory(category);
        sqlSession.close();
        return list;
    }

    public int updateMenu(Map<String, String> map) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        MenuDto menu = new MenuDto();
        menu.setMenuCode(Integer.parseInt(map.get("menuCode")));
        menu.setCategoryCode(Integer.parseInt(map.get("categoryCode")));
        menu.setMenuName(map.get("menuName"));
        menu.setMenuPrice(Integer.parseInt(map.get("menuPrice")));
        menu.setOrderableStatus(map.get("orderableStatus"));
        int result = menuMapper.updateMenuByCode(menu);
        if(result>0) {
            System.out.println("update completed");
            sqlSession.commit();
        } else {
            System.out.println("update failed");
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public int deleteMenu(int code) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.deleteMenuByCode(code);
        if(result>0){
            System.out.println("delete completed");
            sqlSession.commit();
        } else {
            System.out.println("delete failed");
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }
}

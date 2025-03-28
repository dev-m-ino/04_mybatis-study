package com.ino.service;

import com.ino.dao.MenuMapper;
import com.ino.dto.MenuDto;
import com.ino.dto.OrderDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ino.common.Template.getSqlSession;

public class MenuService {

    MenuMapper menuMapper;

    public List<MenuDto> getAllMenuList() {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.getAllMenuList();
        sqlSession.close();
        return list;
    }

    public List<MenuDto> getAllMenuCodeNamePrice() {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.getAllMenuCodeNamePrice();
        sqlSession.close();
        return list;
    }

    public List<MenuDto> testResultMapAssociation() {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.testResultMapAssociation();
        sqlSession.close();
        return list;
    }

    public OrderDto testResultMapCollection(int code) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        OrderDto od = menuMapper.testResultMapCollection(code);
        sqlSession.close();
        return od;
    }

    public MenuDto selectMenuByCode(int code) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        MenuDto menu = menuMapper.selectMenuByCode(code);
        sqlSession.close();
        return menu;
    }

    // 신규 카테고리 등록하며 해당 번호를 통해 메뉴 추가
    public boolean insertMenuAndCategory(MenuDto menu) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result1 = menuMapper.insertCategory(menu);
        // 실행 이후 categoryCode필드에 SELECT LAST_INSERT_ID() 값이 포함되게 바뀜

        int result2 = menuMapper.insertMenu(menu);
        if(result1>0 && result2>0) {
            System.out.println("completely inserted");
            sqlSession.commit();
            return true;
        } else {
            System.out.println("insert failed");
            sqlSession.rollback();
            return false;
        }
    }
}

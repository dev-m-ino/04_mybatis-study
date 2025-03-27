package com.ino.section01.xml;

import com.ino.dto.MenuDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ino.section01.xml.Template.getSqlSession;

public class MenuService {
    MenuDao menuDao = new MenuDao();

    public int insertMenu(MenuDto menuDto) {
        SqlSession sqlSession = getSqlSession();
        int result = menuDao.insertMenu(sqlSession, menuDto);
        if(result>0) {
            sqlSession.commit();
        }
        else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public int updateMenu(MenuDto menu) {
        SqlSession sqlSession = getSqlSession();
        int result = menuDao.updateMenu(sqlSession, menu);
        if(result>0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public int deleteMenu(int code) {
        SqlSession sqlSession = getSqlSession();
        int result = menuDao.deleteMenu(sqlSession, code);
        if(result>0) {
            System.out.println("delete successfully");
            sqlSession.commit();
        } else {
            System.out.println("delete failed");
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public List<String> selectMenuNameList() {
        SqlSession sqlSession = getSqlSession();
        List<String> list = menuDao.selectMenuNameList(sqlSession);
        sqlSession.close();
        return list;
    }

    public List<MenuDto> selectMenuList() {
        SqlSession sqlSession = getSqlSession();
        List<MenuDto> list = menuDao.selectMenuDTOList(sqlSession);
        sqlSession.close();
        return list;
    }

    public int selectOrderableMenuCount() {
        SqlSession sqlSession = getSqlSession();
        int count = menuDao.selectOrderableMenuCount(sqlSession);
        sqlSession.close();
        return count;
    }

    public MenuDto selectMenuByCode(int code) {
        SqlSession sqlSession = getSqlSession();
        MenuDto menu = menuDao.selectMenuByCode(sqlSession, code);
        sqlSession.close();
        return menu;
    }
}

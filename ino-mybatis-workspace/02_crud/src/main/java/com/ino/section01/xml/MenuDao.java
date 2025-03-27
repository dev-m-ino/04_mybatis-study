package com.ino.section01.xml;

import com.ino.dto.MenuDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDao {

    public int insertMenu(SqlSession sqlSession, MenuDto menuDto) {
        return sqlSession.insert("Menu.insert", menuDto);
    }

    public List<MenuDto> selectAll(SqlSession sqlSession) {
        MenuDto menuDto = new MenuDto();
        menuDto.setCategoryCode(2);
        return sqlSession.selectList("Menu.selectList", menuDto);
    }

    public int updateMenu(SqlSession sqlSession, MenuDto menu) {
        return sqlSession.update("Menu.update", menu);
    }

    public int deleteMenu(SqlSession sqlSession, int code) {
        return sqlSession.delete("Menu.delete", code);
    }

    public List<String> selectMenuNameList(SqlSession sqlSession) {
        return sqlSession.selectList("Menu.selectMenuNameList");
    }

    public List<MenuDto> selectMenuDTOList(SqlSession sqlSession) {
        return sqlSession.selectList("Menu.selectMenuList");
    }

    public int selectOrderableMenuCount(SqlSession sqlSession) {
        return sqlSession.selectOne("Menu.selectOrderableMenuCount");
    }

    public MenuDto selectMenuByCode(SqlSession sqlSession, int code) {
        return sqlSession.selectOne("Menu.selectMenuByCode", code);
    }
}

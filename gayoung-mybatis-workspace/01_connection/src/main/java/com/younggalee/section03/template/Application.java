package com.younggalee.section03.template;

import org.apache.ibatis.session.SqlSession;

import static com.younggalee.section03.template.Template.getSqlSession;

public class Application {
    public static void main(String[] args) {
        // 조회요청
        SqlSession sqlSession = getSqlSession();
        System.out.println("조회요청의 sqlSession : " + sqlSession);

        // 수정요청
        SqlSession sqlSession2 = getSqlSession();
        System.out.println("수정요청의 sqlSession : " + sqlSession2);
    }
}

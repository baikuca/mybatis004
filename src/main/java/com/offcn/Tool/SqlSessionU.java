package com.offcn.Tool;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionU {
    static SqlSession sqlSession = null;
    static {

        String cfg = "sqlMapcon.xml";
        InputStream asStream = null;
        try {
            asStream = Resources.getResourceAsStream(cfg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(asStream);
        sqlSession = sqlSessionFactory.openSession();
    }
    public static SqlSession getSqlSession(){
        return sqlSession;
    }
}

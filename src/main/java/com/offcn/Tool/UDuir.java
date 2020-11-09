package com.offcn.Tool;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

public class UDuir {
    public SqlSession sqlSession = null;

   @Before
   public void getSqlSession(){
       sqlSession = SqlSessionU.getSqlSession();
   }

   @After
    public void Commitr(){
       sqlSession.commit();
       sqlSession.close();
   }

}

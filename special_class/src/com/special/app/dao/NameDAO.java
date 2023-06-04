package com.special.app.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.mybatis.config.MyBatisConfig;
import com.special.app.vo.NameVO;

public class NameDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsessionFactory();
	SqlSession sqlSession;

	public NameDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}
	
	public void insert(NameVO nameVO) {
		sqlSession.insert("Name.insert", nameVO);
	}
	
	public NameVO select() {
		return sqlSession.selectOne("Name.select");
	}
	
	
}






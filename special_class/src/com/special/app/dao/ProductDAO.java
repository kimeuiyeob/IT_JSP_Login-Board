package com.special.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.mybatis.config.MyBatisConfig;
import com.special.app.vo.ProductVO;

public class ProductDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsessionFactory();
	SqlSession sqlSession;

	public ProductDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}
	// =============sqlSession을 사용하기 위한 준비물들이다 , 복붙하자============

	// insert는 값을 넣어주는 메소니까 리턴타입이 없다. 넣어주면 땡이니까 그래서 void로 보낸다
	public void insert(ProductVO productVO) {
		// 값을 VO전체를 보내주니까 productVO로 매게변수를 받고 insert해준다.
		sqlSession.insert("Product.insert", productVO);
	}

	// List안에는 ProductVO만 담길수 있는 타입으로 select메소드 선언
	public List<ProductVO> select() {
		// select는 찾아오는거니까 return 즉 돌려줄 값이 있으므로 사용 ,
		// ( )안에는 mapper에 있는 namespace에 select아이디를 접근시킨다.
		return sqlSession.selectList("Product.select");
	}

	public void delete(int productNumber) {
		sqlSession.delete("Product.delete", productNumber);
	}

	public List<ProductVO> showByRecent() {
		return sqlSession.selectList("Product.showByRecent");
	}
}

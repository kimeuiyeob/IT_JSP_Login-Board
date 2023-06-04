package com.koreait.app.product.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.app.product.vo.ProductVO;
import com.koreait.mybatis.config.MyBatisConfig;

public class ProductDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsessionFactory();
	SqlSession sqlSession;

	public ProductDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}
	
	public void insert(ProductVO productVO) {
		sqlSession.insert("product.insert", productVO);
	}
	
	public List<ProductVO> selectAll(){
		return sqlSession.selectList("product.selectAll");
	}
	
//	public : 어떤곳에서도 사용가능, List : 배열(컬렉션프레임워크) , <ProductVO> : <>제너릭 , = List안에 ProductVO만 받을수있다. 
	public List<ProductVO> selectAllByRecent(){
//	return : 돌려준다 , sqlSession : 쿼리문 실행 시키기위한 준비물 , selectList : 준비물안에 selectList메소드를 사용하는데 
//	여러개를 가지고온다. ("product.select") : selectList의 매게변수로 namespace가 product인 mapper에 id가 select인걸 실행켜서 나온값을 return으로 값을 돌려준다. 
		return sqlSession.selectList("product.selectAllByRecent");
	}
	
	public void delete(int productNumber) {
		sqlSession.delete("product.delete", productNumber);
	}
}

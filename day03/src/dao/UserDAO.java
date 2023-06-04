package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.koreait.mybatis.config.MyBatisConfig;

import vo.UserVO;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	public SqlSession sqlSession;
	
	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlsessionFactory().openSession(true);
	}
	
	public boolean checkId(String userId) {
		return (Integer)sqlSession.selectOne("User.checkId", userId) == 1;
	}
	
//	public boolean checkId(String userId) {
//		String query = "select count(user_number) from tbl_user where user_id = ?";
//		boolean check = false;
//		try {
//			connection = DBConnecter.getConnection();
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, userId);
//			resultSet = preparedStatement.executeQuery();
//			
//			resultSet.next();
//			check = resultSet.getInt(1) == 1;
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(resultSet != null) {
//					resultSet.close();
//				}
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}s
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException(e);
//			}
//		}
//		return check;
//	}
	
//	회원가입
	public void insert(UserVO userVO) { 
		sqlSession.insert("User.insert", userVO);
	}
//	public void insert(UserVO userVO) {
//		String query = "insert into tbl_user (user_id) values (?)";
//		try {
//			connection = DBConnecter.getConnection();
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, userVO.getUserId());
//			preparedStatement.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException(e);
//			}
//		}
//	}
}











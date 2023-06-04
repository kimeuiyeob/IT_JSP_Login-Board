package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.GuestVO;

public class GuestDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	
//	전체 회원 조회
	public ArrayList<GuestVO> selectAll(boolean asc){
		String query = "select guest_number, guest_name, guest_birth from tbl_guest";
		query += asc ? " order by guest_number" : " order by guest_number desc";
		ArrayList<GuestVO> guests = new ArrayList<>();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				GuestVO guestVO = new GuestVO();
				guestVO.setGuestNumber(resultSet.getInt(1));
				guestVO.setGuestName(resultSet.getString(2));
				guestVO.setGuestBirth(resultSet.getString(3));
				
				guests.add(guestVO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return guests;
	}
	
//	전체 회원 조회
	public ArrayList<GuestVO> select(String keyword){
		String query = "select guest_number, guest_name, guest_birth from tbl_guest where guest_name = ?";
		ArrayList<GuestVO> guests = new ArrayList<>();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, keyword);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				GuestVO guestVO = new GuestVO();
				guestVO.setGuestNumber(resultSet.getInt(1));
				guestVO.setGuestName(resultSet.getString(2));
				guestVO.setGuestBirth(resultSet.getString(3));
				
				guests.add(guestVO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return guests;
	}
}























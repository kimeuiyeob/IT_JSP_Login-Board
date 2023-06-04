package com.special.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.special.app.dao.NameDAO;
import com.special.app.vo.NameVO;

public class InputDB extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		execute(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		execute(req, resp);
	}
	
	protected void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		NameDAO nameDAO = new NameDAO();
		NameVO nameVO = new NameVO();
		String name = req.getParameter("name");
		
		nameVO.setName(name);
		
		nameDAO.insert(nameVO);
		
		req.setAttribute("nameVO", nameDAO.select());
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/hello.jsp");
		requestDispatcher.forward(req, resp);
		
//		resp.sendRedirect("");
	}
}






package com.koreait.app.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.app.Result;

public class MemberFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String request = requestURI.substring(contextPath.length());
		Result result = null;
		
		if(request.equals("/member/checkIdOk.me")) {
			new CheckIdOkController().execute(req, resp);
			
		}else if(request.equals("/member/join.me")) {
			result = new Result();
			result.setPath("/app/member/join.jsp");
			
		}else if(request.equals("/member/joinOk.me")) {
			result = new JoinOkController().execute(req, resp);
			
		}else if(request.equals("/member/login.me")) {
			result = new LoginController().execute(req, resp);
			
		}else if(request.equals("/member/loginOk.me")) {
			result = new LoginOkController().execute(req, resp);
			
		}else if(request.equals("/member/logout.me")) {
			result = new LogOutController().execute(req, resp);
			
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher(result.getPath());
				dispatcher.forward(req, resp);
			}
		}
	}
}

















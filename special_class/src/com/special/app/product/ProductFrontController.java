package com.special.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		execute(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		execute(req, resp);
	}

	protected void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String target = uri.substring(req.getContextPath().length());
		if (target.equals("/create.prod")) {
			new CreateController().execute(req, resp);

		} else if (target.equals("/show.prod")) {
			new ShowController().execute(req, resp);

		} else if (target.equals("/deleteOk.prod")) {
			new DeleteOkController().execute(req, resp);

		} else if (target.equals("/showByRecent.prod")) {
			new ShowByRecentController().execute(req, resp);
		}
	}
}

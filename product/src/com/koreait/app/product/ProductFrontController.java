package com.koreait.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI(); // /product/....
		String target = url.substring(req.getContextPath().length()); // /....

		if (target.equals("/create.prod")) {
			new CreateController().execute(req, resp);

		} else if (target.equals("/list.prod")) {
			new ListController().execute(req, resp);

		} else if (target.equals("/selectAllByRecent.prod")) {
			new SelectAllByRecentController().execute(req, resp);

		} else if (target.equals("/delete.prod")) {
			new DeleteController().execute(req, resp);

		} else if (target.equals("/update.prod")) {
			new UpdateController().execute(req, resp);
		}
	}
}

package com.koreait.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.app.Execute;
import com.koreait.app.product.dao.ProductDAO;

public class DeleteController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int productNumber = Integer.valueOf(req.getParameter("productNumber"));
		new ProductDAO().delete(productNumber);
	}

}

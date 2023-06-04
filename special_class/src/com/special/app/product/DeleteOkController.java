package com.special.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.special.app.Execute;
import com.special.app.dao.ProductDAO;

public class DeleteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductDAO productDAO = new ProductDAO();
		
		int productNumber = Integer.valueOf(req.getParameter("productNumber"));
		
		productDAO.delete(productNumber);		
		
	}
}

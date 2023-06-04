package com.special.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.special.app.Execute;
import com.special.app.dao.ProductDAO;
import com.special.app.vo.ProductVO;

public class CreateController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductVO productVO = new ProductVO();
		ProductDAO productDAO = new ProductDAO();
		
		productVO.setProductName(req.getParameter("productName"));
		productVO.setProductPrice(Integer.valueOf(req.getParameter("productPrice")));
		productVO.setProductStock(Integer.valueOf(req.getParameter("productStock")));
		
		productDAO.insert(productVO);
	}
}










package com.koreait.app.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.koreait.app.Execute;
import com.koreait.app.product.dao.ProductDAO;

public class SelectAllByRecentController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		JSONArray products = new JSONArray();
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		ProductDAO productDAO = new ProductDAO();
		
//		for(ProductVO productVO : new ProductDAO().selectAllByRecent()) {
//			JSONObject product = new JSONObject(productVO);
//			products.put(product);
//		}
		
		productDAO.selectAllByRecent().stream().map(productVO -> new JSONObject(productVO)).forEach(product -> products.put(product));
		
		out.print(products.toString());
		out.close();
		
	}
}

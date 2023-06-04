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
import com.koreait.app.product.vo.ProductVO;

public class ListController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductDAO productDAO = new ProductDAO();
		JSONArray products = new JSONArray();
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		productDAO.selectAll().stream().map(productVO -> new JSONObject(productVO)).forEach(product -> products.put(product));
		
		out.print(products.toString());
		out.close();
	}
}








package com.special.app.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.special.app.Execute;
import com.special.app.dao.ProductDAO;

public class ShowByRecentController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductDAO productDAO = new ProductDAO();
		JSONArray products = new JSONArray();
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		productDAO.showByRecent().stream().map(productVO -> new JSONObject(productVO)).forEach(product -> products.put(product));
		
		out.print(products.toString());
		out.close();
		
		
	}

}

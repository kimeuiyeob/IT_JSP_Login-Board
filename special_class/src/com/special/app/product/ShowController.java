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

public class ShowController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//ProductDAO를 객체화 한다. DAO안에 있는 select()함수를 사용하기 위해서
		ProductDAO productDAO = new ProductDAO();
		//jsp파일에서 datatype을 json즉 json형식으로 받으니까 담아줄 json리스트 객체화
		JSONArray products = new JSONArray();
		//응답 즉 보낼 글자타입을 utf-8로 보내준다.
		resp.setContentType("text/html; charset=utf-8");
		//json형식으로 보낼때 필요한거다. 아래 out.print로 해서 보내준다.
		PrintWriter out = resp.getWriter();
		
		//productDAO안에있는select메소드실행 .map은 반복및 값을 변경한다.
		//즉 productVO를 가져와 하나하나 JSONObject에 담아준다.그리고 반복문을 통하여 products안에 다담아준다.
		productDAO.select().stream().map(productVO -> new JSONObject(productVO)).forEach(product -> products.put(product));
		
		//여기서 out.print를 통하여 jsp에있는 ajax로 보낸다.
		out.print(products.toString());
		//닫아준다 , 이쪽은 ajax형식으로 페이지 이동없이 값을 보낼때 사용됨으로 전체적으로 복붙하자!!
		out.close();
		
	}

}

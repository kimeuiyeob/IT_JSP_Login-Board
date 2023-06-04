package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Oper
 */
//@WebServlet("/oper") //어노테이션 만약 web.xml에 경로를 구축하였으면 이걸 지워준다.안그러면 충돌나서 에러
public class Oper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	request가 값을 받아온다고 생각
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); //한글같은거 안깨지게 하는거
		String input = request.getParameter("input"); 
		//request.getParameter로 입력창에 내가 넣은 값을 input에 저장 ,만약 5+5로 입력했다면 input에는 문자열 "5+5" 이다.
		PrintWriter out = response.getWriter(); //파일 입출력이라고 생각, 이걸 선언해줘야 out.print해서 HTML로 출력할수있다.
		
		String opers = "+-*/";
		String oper = null;
		String[] nums = null;
		Calc calc = null;
		int result = 0;
		String msg = null;
		
		for (int i = 0; i < input.length(); i++) {  //만약 5+5면 길이가 3이다, 즉 3번 반복
			for (int j = 0; j < opers.length(); j++) {  //이건 길이가 4이므로 4번 반복
				if(input.charAt(i) == opers.charAt(j)) { 
					oper = String.valueOf(input.charAt(i));  
					//이때 String.valueOf를 사용해줬는데 charAt으로 문자로 형변환된것을 다시 문자열로 바까준다.
				}
			}
		}
		
		nums = input.split("\\" + oper); //이때 oper에는 + or - or * or / 중 하나가 들어가있을것이다.
		//이때 split을 사용 "\\"이건 사칙연산은 이걸 붙여줘야 인식이 가능해서 저걸 붙여주면 앞에 정수와 뒤에정수 즉 0번째인덱스에 5,그리고 1번째 인덱스에 5가 들어가게된다.
		
		try {
			calc = new Calc(nums[0], nums[1]);
			if(nums.length > 2) { throw new NumberFormatException(); } //만약 nums즉 정수를 3개 이상썻으면 강제로 오류를 던져 막아버린다.
		
			switch(oper) { 
			//switch문을 써서 위에처럼 oper에는 저 사칙연산중 한개가 있을것이며 같은게 들어오면 그에 해당하는 메소드를 실행한다.
			case "+":
				result = calc.add();
				break;
			case "-":
				result = calc.sub();
				break;
			case "*":
				result = calc.mul();
				break;
			case "/":
				result = calc.div();
				break;
			}
			
			msg = "<h1> 결과 : " + result + "</h1>";
			
		} catch (ArithmeticException e) {
//			0으로 나눔
			msg = "<h1 style='color: red'> 0으로 나눌 수 없습니다. </h1>";
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//			잘못 입력
			msg = "<h1 style='color: red'> 잘못된 수식입니다. </h1>";
		}
		
		out.print(msg);
		out.print("<a href='calc'>다시 계산하기</a>");
		out.close();
	}
}




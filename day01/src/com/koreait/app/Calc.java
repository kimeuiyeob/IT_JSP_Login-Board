package com.koreait.app;

public class Calc { // 자바로 Calc클래스를 생성

	public int number1; // int타입 변수1
	public int number2; // int타입 변수2

	public Calc() {
		;
	} // 기본생성자

	public Calc(int number1, int number2) {
		// 초기화 생성자를 만들어서 기본생성자를 만들어줘야함
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public Calc(String number1, String number2) { // 문자열로 두 정수를 받으면
		this(Integer.parseInt(number1), Integer.parseInt(number2)); // 여기서 정수로 바까서 돌려준다.
	}

	public int add() { //더하기
		return number1 + number2;
	}

	public int sub() { //빼기
		return number1 - number2;
	}

	public int mul() { //곱셈
		return number1 * number2;
	}

	public int div() { //나눗셈
		return number1 / number2;
	}
}

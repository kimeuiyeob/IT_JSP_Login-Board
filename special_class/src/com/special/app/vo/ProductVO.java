package com.special.app.vo;

public class ProductVO {
	private int productNumber;
	private String productName;
	private int productPrice;
	private int productStock;
	
	public ProductVO() {;}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	@Override
	public String toString() {
		return "ProductVO [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productStock=" + productStock + "]";
	}
}

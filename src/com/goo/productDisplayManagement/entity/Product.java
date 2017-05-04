package com.goo.productDisplayManagement.entity;

public class Product {
	private int productId;
	private String productName;
	private String productUnitPrice;
	private int saledAmount;
	private int existAmount;
	private boolean isHotSale;
	private String pictureUrl;
	private String category;

	public Product() {
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductUnitPrice() {
		return productUnitPrice;
	}
	public void setProductUnitPrice(String productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	public int getSaledAmount() {
		return saledAmount;
	}
	public void setSaledAmount(int saledAmount) {
		this.saledAmount = saledAmount;
	}
	public int getExistAmount() {
		return existAmount;
	}
	public void setExistAmount(int existAmount) {
		this.existAmount = existAmount;
	}
	public boolean isHotSale() {
		return isHotSale;
	}
	public void setHotSale(boolean isHotSale) {
		this.isHotSale = isHotSale;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}

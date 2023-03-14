package com.akhm.service.dto;




public class CategoryDTO {

	private Integer  CategoryId;
	private String  CategoryName;
	private String CategoryDescription;
	private String CategoryCode;
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDescription() {
		return CategoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}
	public String getCategoryCode() {
		return CategoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		CategoryCode = categoryCode;
	}
	

	
}

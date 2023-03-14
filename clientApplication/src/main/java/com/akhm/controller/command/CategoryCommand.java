package com.akhm.controller.command;

public class CategoryCommand {
	private Integer categoryId;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	private String categoryName;
	private String categoryDescription;
	private String categorCode;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getCategorCode() {
		return categorCode;
	}
	public void setCategorCode(String categorCode) {
		this.categorCode = categorCode;
	}
	

}

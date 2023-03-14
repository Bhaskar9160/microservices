package com.akhm.repository.enity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT_TL")
public class ProductEntity {
	@Id
	@GeneratedValue
	@Column(name="PRODUCT_ID")
	private Integer productId;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRODUCT_CODE")
	private String productCode;
	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription;
	@Column(name="PRODUCT_IMAGE_NAME")
	private String productImageName;
	@Column(name="CATEGORY_ID")
	private Integer categoryId;
	@Column(name="SUBCATEGORY_ID")
	private Integer subCategoryId;
	@Column(name="PRODUCT_STATUS")
	private String productStatus;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductImageName() {
		return productImageName;
	}
	public void setProductImageName(String productImageName) {
		this.productImageName = productImageName;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}

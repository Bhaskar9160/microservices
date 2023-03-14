package com.akhm.repository.enity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="PRODUCT_PRICE_TL")
public class ProductPriceEntity {
	@Id
	@GeneratedValue
	@Column(name="PRODUCT_PRICE_ID")
	private Integer productPriceId;
	@Column(name="PRODUCT_ID")
	private Integer productId;
	@Column(name="AMOUNT")
	private Double amount;
	@Column(name="STATUS")
	private String status;
	@Column(name="CREATE_ON")
	private Date createOn;
	public Integer getProductPriceId() {
		return productPriceId;
	}
	public void setProductPriceId(Integer productPriceId) {
		this.productPriceId = productPriceId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

}

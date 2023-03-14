package com.akhm.service;

import java.util.List;

import com.akhm.repository.enity.ProductEntity;

public interface ProductService {
	public Integer insertProduct(ProductEntity productEntity);
	public List<ProductEntity> getProducts();
	public ProductEntity getProduct(Integer productId);
	public void updateProduct(ProductEntity productEntity);
	public void deleteProduct(Integer productId);

}

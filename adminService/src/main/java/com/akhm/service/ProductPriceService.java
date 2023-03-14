package com.akhm.service;

import java.util.List;

import com.akhm.repository.enity.ProductPriceEntity;

public interface ProductPriceService {
	public Integer insertProductPrice(ProductPriceEntity productPriceEntity);
	public List<ProductPriceEntity> getProductPrices(Integer productId,String status);
	public ProductPriceEntity getProductPrice(Integer productId,String status);
	public void updateProductPrice(ProductPriceEntity productPriceEntity);

}

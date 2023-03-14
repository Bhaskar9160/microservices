package com.akhm.service;

import java.util.List;

import com.akhm.service.dto.ProductPriceDTO;

public interface ProductPriceService {
	public Integer insertProductPrice(ProductPriceDTO productPriceDTO);
	public List<ProductPriceDTO> getProductPrices(Integer productId,String status);
	public ProductPriceDTO getProductPrice(Integer productId,String status);
	public void updateProductPrice(ProductPriceDTO productPriceDTO);


}

package com.akhm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.clients.ProductPriceClient;
import com.akhm.exception.MyClientCustomException;
import com.akhm.service.ProductPriceService;
import com.akhm.service.dto.ProductPriceDTO;
@Service
public class ProductPriceServiceImpl implements ProductPriceService {
	@Autowired
	private ProductPriceClient productPriceClient;

	@Override
	public Integer insertProductPrice(ProductPriceDTO productPriceDTO) {
		try {
			return productPriceClient.saveProductPrice(productPriceDTO);
		} catch (Exception e) {
			throw new  MyClientCustomException(e.getMessage());
		}

		}
		
	

	@Override
	public List<ProductPriceDTO> getProductPrices(Integer productId, String status) {
		try {
			return productPriceClient.getProductPrices(productId, status);
		} catch (Exception e) {
			throw new MyClientCustomException(e.getMessage());
		}
	}

	@Override
	public ProductPriceDTO getProductPrice(Integer productId, String status) {
		try {
			return productPriceClient.getProductPrice(productId, status);
		} catch (Exception e) {
			throw new MyClientCustomException(e.getMessage());
		}
	}

	@Override
	public void updateProductPrice(ProductPriceDTO productPriceDTO) {
		try {
			productPriceClient.updateProductPrice(productPriceDTO);
		} catch (Exception e) {
			throw new MyClientCustomException(e.getMessage());
		}

	}

}

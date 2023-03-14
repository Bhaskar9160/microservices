package com.akhm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.clients.ProductClient;
import com.akhm.exception.MyClientCustomException;
import com.akhm.service.ProductService;
import com.akhm.service.dto.ProductDTO;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductClient productClient;

	@Override
	public Integer insertProduct(ProductDTO productDTO) {
		log.info("{}-ProductServiceImpl insertProduct() started");
		try {
			log.info("{}-ProductServiceImpl insertProduct() getting Category details is ProductClient");	
			return productClient.saveProduct(productDTO);
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl insertProduct()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
	}

	@Override
	public List<ProductDTO> getProducts() {
		log.info("{}-ProductServiceImpl getProducts() started");
		try {
			log.info("{}-ProductServiceImpl getProducts() getting Category details is ProductClient");	
			return productClient.getProducts();
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl  getProducts()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
			
		}
	}

	@Override
	public ProductDTO getProduct(Integer productId) {
		log.info("{}-ProductServiceImpl getProduct() started");
		try {
			log.info("{}-ProductServiceImpl getProduct() getting Category details is ProductClient");
			return productClient.getProduct(productId);
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl  getProduct()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
	}

	@Override
	public void updateProduct(ProductDTO productDTO) {
		log.info("{}-ProductServiceImpl updateProduct() started");
		try {
			log.info("{}-ProductServiceImpl updateCategory() getting Category details is ProductClient");
			productClient.updateProduct(productDTO);
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl   updateProduct()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
	
		
	}

	@Override
	public void delectProduct(Integer productId) {
		log.info("{}-ProductServiceImpl delectProduct() started");
		try {
			log.info("{}-ProductServiceImpl delectProduct() save");
			productClient.deleteProduct(productId);
			
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl   delectProduct()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
		
	}

}

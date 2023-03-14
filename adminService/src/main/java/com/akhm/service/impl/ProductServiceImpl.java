package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.MyCustomException;
import com.akhm.repository.ProductRepository;
import com.akhm.repository.enity.ProductEntity;
import com.akhm.service.ProductService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Integer insertProduct(ProductEntity productEntity) {
		log.info("{}-ProductServiceImpl insertProduct() started");
		try {
			log.info("{}-ProductServiceImpl insertProduct() save");
			ProductEntity product=productRepository.save(productEntity);
			if(product!=null)
			{
				return product.getProductId();
			}
			else {
				return null;
			}
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl is insertProduct()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
	}

	@Override
	public List<ProductEntity> getProducts() {
		log.info("{}-ProductServiceImpl getProducts() started");
		try {
			log.info("{}-ProductServiceImpl getProducts() save");
			return productRepository.findAll();
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is getProducts()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
	}

	@Override
	public ProductEntity getProduct(Integer productId) {
		log.info("{}-ProductServiceImpl getProduct() started");
		try {
			log.info("{}-ProductServiceImpl getProduct() save");
			Optional<ProductEntity> optional=productRepository.findById(productId);
			if(optional!=null)
			{
				return optional.get();
			}
			else {
				return null;
			}
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl is getProduct()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
	}

	@Override
	public void updateProduct(ProductEntity productEntity) {
		log.info("{}-ProductServiceImpl updateProduct() started");
		try {
			log.info("{}-ProductServiceImpl updateProduct() save");
			productRepository.save(productEntity);
		} catch (Exception e) {
			log.error("{}-ProductServiceImpl is updateProduct()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
		
	}

	@Override
	public void deleteProduct(Integer productId) {
		log.info("{}-ProductServiceImpl deleteProduct() started");
		try {
			log.info("{}-ProductServiceImpl deleteProduct() save");
			productRepository.deleteById(productId);
		} catch (Exception e) {
			log.error("{}-ProductCategoryServiceImpl is deleteProduct()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
		
	}

}

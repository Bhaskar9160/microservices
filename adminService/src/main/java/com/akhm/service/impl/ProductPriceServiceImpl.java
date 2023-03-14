package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.MyCustomException;
import com.akhm.repository.ProductPriceRepository;
import com.akhm.repository.enity.ProductPriceEntity;
import com.akhm.service.ProductPriceService;
import com.mysql.jdbc.log.Log;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ProductPriceServiceImpl implements ProductPriceService {
	@Autowired
	private ProductPriceRepository productPriceRepository;
	

	@Override
	public Integer insertProductPrice(ProductPriceEntity productPriceEntity) {
		log.info("{}-serviceImpl insertProductPrice() Started");
		try {
			
			ProductPriceEntity productPrice=productPriceRepository.save(productPriceEntity);
			if(productPrice!=null)
			{
				return productPrice.getProductPriceId();
			}
			else
			{
				return null;
			}
		} catch (Exception e) {
			log.error("{}-serviceImpl-insertProductPrice()-exception occured-{}");
			throw new MyCustomException(e.getMessage());
		}
	}

	@Override
	public List<ProductPriceEntity> getProductPrices(Integer productId, String status) {
		log.info("{}-serviceImpl getProductPrices() Started");
		try {
			log.info("{}-ServiceImpl getProductPrice() getting productPrices");
			return productPriceRepository.findAllByProductIdAndStatus(productId, status);
		} catch (Exception e) {
			log.error("{}-serviceImpl-getProductPrices()-exception occured-{}");
			throw new MyCustomException(e.getMessage());
		}
		
	}

	@Override
	public ProductPriceEntity getProductPrice(Integer productId, String status) {
		log.info("{}-serviceImpl getProductPrice() Started");
		try {
			Optional<ProductPriceEntity> optional=productPriceRepository.findByProductIdAndStatus(productId, status);
			if(optional!=null)
			{
				return optional.get();
			}
			else {
				return null;
			}
		} catch (Exception e) {
			log.error("{}-serviceImpl-getProductPrice()-exception occured-{}");
			throw new MyCustomException(e.getMessage());
		}
		
	}

	@Override
	public void updateProductPrice(ProductPriceEntity productPriceEntity) {
		log.info("{}-serviceImpl updateProductPrice() Started");
		try {
			log.info("{}-ServiceImpl updateProductPrice() updated productPrices");
			productPriceRepository.save(productPriceEntity);
		} catch (Exception e) {
			log.error("{}-serviceImpl-updateProductPrice()-exception occured-{}");
			throw new MyCustomException(e.getMessage());
		}
		
	}
	

}

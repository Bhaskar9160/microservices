package com.akhm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.repository.enity.ProductPriceEntity;
import com.akhm.service.ProductPriceService;
@RestController
public class ProductPriceController {
	@Autowired
	private ProductPriceService productPriceService;
	@PostMapping("/productprice/save")
	public ResponseEntity<Integer> saveProductPrice(@RequestBody ProductPriceEntity productPriceEntity){
		try {
			return new ResponseEntity<Integer>(productPriceService.insertProductPrice(productPriceEntity),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/productprice/get")
	public ResponseEntity<List<ProductPriceEntity>>getProductPrices(@RequestParam(" productId") Integer productId,@RequestParam("status") String status){
		try {
			List<ProductPriceEntity>  productPrices=productPriceService.getProductPrices(productId, status);
			return new ResponseEntity<List<ProductPriceEntity>>(productPrices, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<ProductPriceEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/productprice/get/{productid}")
	public ResponseEntity<ProductPriceEntity> getProductyPrice(@PathVariable Integer productId,String status){
		try {
			ProductPriceEntity productPrice=productPriceService.getProductPrice(productId, status);
			return new ResponseEntity<ProductPriceEntity>(productPrice,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ProductPriceEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping("/productprice/update")
	public ResponseEntity<Void> updateProductPrice(ProductPriceEntity productPriceEntity){
		try {
			productPriceService.updateProductPrice(productPriceEntity);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}

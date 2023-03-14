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

import com.akhm.repository.enity.ProductEntity;
import com.akhm.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductController {
	@Autowired
	private ProductService productService;
	@PostMapping("/product/save")
	public ResponseEntity<Integer> saveProduct(@RequestBody ProductEntity productEntity)
	{
		log.info("{}-ProductController saveProduct() method started");
		try {
			log.info("{}-ProductController saveProduct()method Deatiles Successfully executed");
			return new ResponseEntity<Integer>(productService.insertProduct(productEntity),HttpStatus.CREATED);
			
		} catch (Exception e) {
			log.error("{}-ProductController saveProduct() method Error message is:"+e.getMessage());
			return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/product/get")
	public ResponseEntity<List<ProductEntity>>getProducts()
	{
		log.info("{}-ProductController  getProducts() method started");
		try {
			log.info("{}-ProductController getProducts()method Deatiles Successfully executed");
			List<ProductEntity> products=productService.getProducts();
			return new ResponseEntity<List<ProductEntity>>(products,HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-ProductController getProducts() method Error message is:"+e.getMessage());
			return new ResponseEntity<List<ProductEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/product/get/{productId}")
	public ResponseEntity<ProductEntity> getProduct(@PathVariable Integer productId)
	{
		log.info("{}-ProductController getProduct() method started");
		try {
			log.info("{}-ProductController  getProduct()method Deatiles Successfully executed");
			ProductEntity product=productService.getProduct(productId);
			return new ResponseEntity<ProductEntity>(product,HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-ProductController getProduct() method Error message is:"+e.getMessage());
			return new ResponseEntity<ProductEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<Void> updateProduct(@RequestBody ProductEntity productEntity)
	{
		log.info("{}-ProductController updateProduct() method started");
		try {
			log.info("{}-ProductController updateProduct()method Deatiles Successfully executed");
			productService.updateProduct(productEntity);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-ProductController updateProduct() method Error message is:"+e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<Void> deleteProduct(@RequestParam("productId")Integer productId)
	{
		log.info("{}-ProductController deleteProduct() method started");
		try {
			log.info("{}-ProductController deleteProduct()method Deatiles Successfully executed");
			productService.deleteProduct(productId);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-ProductController deleteProduct() method Error message is:"+e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

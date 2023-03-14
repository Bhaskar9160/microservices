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

import com.akhm.repository.enity.CategoryEntity;
import com.akhm.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@PostMapping("/category/save")
	public ResponseEntity<Integer> saveCategory(@RequestBody CategoryEntity categoryEntity){
		log.info("{}-CategoryController saveCategory() method started");
		try {
			log.info("{}-CategoryController saveCategory()method Deatiles Successfully executed");
			return new ResponseEntity<Integer>(categoryService.insertCategory(categoryEntity),HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("{}-CategoryController saveCategory() method Error message is:"+e.getMessage());
			return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/category/get")
	public ResponseEntity<List<CategoryEntity>> getCategories(){
		try {
			List<CategoryEntity> categories=categoryService.getCategories();
			return new ResponseEntity<List<CategoryEntity>>(categories,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/category/get/{categoryid}")
	public ResponseEntity<CategoryEntity> getCategory(@PathVariable Integer categoryId){
		try {
			CategoryEntity category=categoryService.getCategory(categoryId);
			return new ResponseEntity<CategoryEntity>(category,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<CategoryEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/category/update")
	public ResponseEntity<Void> updateCategory(@RequestBody CategoryEntity categoryEntity) {
		try {
			categoryService.updateCategory(categoryEntity);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/category/delete")
	public ResponseEntity<Void> deleteCategory(@RequestParam("categoryId")Integer categoryId)
	{
		try {
			categoryService.deleteCategory(categoryId);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
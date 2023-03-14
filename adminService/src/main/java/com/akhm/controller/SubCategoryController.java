package com.akhm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.repository.enity.CategoryEntity;
import com.akhm.repository.enity.SubCategoryEntity;
import com.akhm.service.SubCategoryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/subCategory/v1")
public class SubCategoryController {
	@Autowired
	private SubCategoryService subCategoryService;
	@PostMapping("/subcategory")
	public ResponseEntity<Integer> saveSubCategory(@RequestBody SubCategoryEntity subcategoryEntity){
		log.info("{}-SubCategoryController saveSubCategory() method started");
		try {
			log.info("{}-SubCategoryController saveSubCategory()method Deatiles Successfully executed");
			return new ResponseEntity<Integer>(subCategoryService.insertSubCategory(subcategoryEntity),HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("{}-SubCategoryController saveSubCategory() method Error message is:"+e.getMessage());
			return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/category/save")
	public ResponseEntity<List<SubCategoryEntity>> getSubCategories()
	{
		log.info("{}-SubCategoryController getSubCategories() method started");
		try {
			log.info("{}-SubCategoryController getSubCategories()method Deatiles Successfully executed");
			//List<CategoryEntity> categories=categoryService.getCategories();
			//return new ResponseEntity<List<CategoryEntity>>(categories.(HttpStatus.OK)
			return null;
		} catch (Exception e) {
			log.error("{}-SubCategoryController getSubCategories() method Error message is:"+e.getMessage());
			return new ResponseEntity<List<SubCategoryEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/category/get/{categoryid}")
	public ResponseEntity<SubCategoryEntity> getSubCategory(@PathVariable Integer subCategoryId)
	{
		log.info("{}-SubCategoryController  getSubCategory() method started");
		try {
			log.info("{}-SubCategoryController  getSubCategory()method Deatiles Successfully executed");
			SubCategoryEntity category=subCategoryService.getSubCategory(subCategoryId);
			return new ResponseEntity<SubCategoryEntity>(category,HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-SubCategoryController  getSubCategory() method Error message is:"+e.getMessage());
			return new ResponseEntity<SubCategoryEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/category/update")
	public ResponseEntity<Void> updateSubCategory(@RequestBody SubCategoryEntity subCategoryEntity)
	{
		log.info("{}-SubCategoryController updateSubCategory() method started");
		try {
			log.info("{}-SubCategoryController  updateSubCategory()method Deatiles Successfully executed");
			subCategoryService.updateSubCategory(subCategoryEntity);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-SubCategoryController updateSubCategory() method Error message is:"+e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/category/delete")
	public ResponseEntity<Void> deleteSubCategory(@RequestParam("subCategoryId")Integer subCategoryId)
	{
		log.info("{}-SubCategoryController deleteSubCategory() method started");
		try {
			log.info("{}-SubCategoryController deleteSubCategory()method Deatiles Successfully executed");
			subCategoryService.deleteSubCategory(subCategoryId);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-SubCategoryController deleteSubCategory() method Error message is:"+e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
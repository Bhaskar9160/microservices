package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.MyCustomException;
import com.akhm.repository.CategoryRepository;
import com.akhm.repository.enity.CategoryEntity;
import com.akhm.service.CategoryService;
import com.mysql.jdbc.log.Log;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository CategoryRepository;

	@Override
	public Integer insertCategory(CategoryEntity Category) {
		log.info("{}-CategoryServiceImpl insertCategory() started");
		try {
			log.info("{}-CategoryServiceImpl insertCategory() save");
			CategoryEntity chariagiri=CategoryRepository.save(Category);
			if(Category!=null)
			{
				return chariagiri.getCategoryId();
			}
			else {
				return null;
			}
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is insertCategory()exception occured-{}");
			throw new MyCustomException(e.getMessage());
			
		}
		
	}

	@Override
	public List<CategoryEntity> getCategories() {
		log.info("{}-CategoryServiceImpl  getCategories() started");
		try {
			log.info("{}-CategoryServiceImpl  getCategories() save");
			return CategoryRepository.findAll();
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is  getCategories()exception occured-{}");
			throw new  MyCustomException(e.getMessage());
		}
		
	}

	@Override
	public CategoryEntity getCategory(Integer CategoryId) {
		log.info("{}-CategoryServiceImpl getCategory() started");
		try {
			log.info("{}-CategoryServiceImpl getCategory() save");
			Optional<CategoryEntity> optional=CategoryRepository.findById(CategoryId);
			if(optional.isPresent())
			{
				return optional.get();
			}
			else {
				return null;
			}
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is getCategory()exception occured-{}");
			throw new MyCustomException(e.getMessage());
		}
	}

	@Override
	public void updateCategory(CategoryEntity CategoryEntity) {
		log.info("{}-CategoryServiceImpl updateCategory() started");
		try {
			log.info("{}-CategoryServiceImpl updateCategory() save");
			CategoryRepository.save(CategoryEntity);
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is updateCategory()exception occured-{}");
			throw new MyCustomException(e.getMessage());
		}
		
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		log.info("{}-CategoryServiceImpl deleteCategory() started");
		try {
			log.info("{}-CategoryServiceImpl deleteCategory() save");
			CategoryRepository.deleteById(categoryId);
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is deleteCategory()exception occured-{}");
			throw new MyCustomException(e.getMessage());
		}
		
	}

}

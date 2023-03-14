package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.MyCustomException;
import com.akhm.repository.SubCategoryRepository;

import com.akhm.repository.enity.SubCategoryEntity;
import com.akhm.service.SubCategoryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SubCategoryServiceImpl  implements SubCategoryService{
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Override
	public Integer insertSubCategory(SubCategoryEntity subCategoryEntity) {
		log.info("{}-ServiceImpl inserSubCategory() started");
		try {
			log.info("{}-ServiceImpl inserSubCategory() save");
			SubCategoryEntity category=subCategoryRepository.save(subCategoryEntity);
			if(category!=null) {
				return category.getCategoryId();
			} else {
				return null;
			}
			
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is insertSubCategory()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
	}

	@Override
	public List<SubCategoryEntity> getSubCategories() {
		log.info("{}-ServiceImpl getSubCategories() started");
		try {
			log.info("{}-ServiceImpl getSubCategories() save");
			return subCategoryRepository.findAll();
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is getSubCategories()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
		
	}

	@Override
	public SubCategoryEntity getSubCategory(Integer subCategoryId) {
		log.info("{}-ServiceImpl getSubCategory() started");
		try {
			log.info("{}-ServiceImpl getSubCategory() save");
			Optional<SubCategoryEntity> optional=subCategoryRepository.findById(subCategoryId);
			if(optional!=null) {
				return optional.get();
			} else {
				return null;
			}
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is getSubCategory()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
	}

	@Override
	public void updateSubCategory(SubCategoryEntity subCategoryEntity) {
		log.info("{}-ServiceImpl updateSubCategory() started");
		try {
			log.info("{}-ServiceImpl updateSubCategory() save");
			subCategoryRepository.save(subCategoryEntity);
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is updateSubCategory()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
		
	}

	@Override
	public void deleteSubCategory(Integer categoryId) {
		log.info("{}-ServiceImpl deleteSubCategory() started");
		try {
			log.info("{}-ServiceImpl deleteSubCategory() save");
			subCategoryRepository.deleteById(categoryId);
		} catch (Exception e) {
			log.error("{}-CategoryServiceImpl is deleteSubCategory()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}
		
	}
}
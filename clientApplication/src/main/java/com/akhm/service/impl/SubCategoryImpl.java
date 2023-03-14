package com.akhm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.clients.SubCategoryClient;
import com.akhm.exception.MyClientCustomException;
import com.akhm.service.SubCategoryService;
import com.akhm.service.dto.SubCategoryDTO;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class SubCategoryImpl implements SubCategoryService{
	@Autowired
	private SubCategoryClient subCategoryClient;

	@Override
	public Integer insertSubCategory(SubCategoryDTO subCategoryDTO) {
		log.info("{}-SubCategoryServiceImpl insertSubCategory() started");
		try {
			log.info("{}-SubCategoryServiceImpl insertSubCategory() getting Category details is SubCategoryClient");
			return subCategoryClient.saveSubCategory(subCategoryDTO);
		} catch (Exception e) {
			log.error("{}-SubCategoryServiceImpl   insertSubCategory()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
		
	}

	@Override
	public List<SubCategoryDTO> getSubCategories() {
		log.info("{}-SubCategoryServiceImpl getSubCategories() started");
		try {
			log.info("{}-SubCategoryServiceImpl getSubCategories() getting Category details is SubCategoryClient");
			return subCategoryClient.getSubCategories();
		} catch (Exception e) {
			log.error("{}-SubCategoryServiceImpl   getSubCategories()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
	}

	@Override
	public SubCategoryDTO getSubCategory(Integer subCategoryId) {
		log.info("{}-SubCategoryServiceImpl getSubCategory() started");
		try {
			log.info("{}-SubCategoryServiceImpl getSubCategory() getting Category details is SubCategoryClient");
			return subCategoryClient.getSubCategory(subCategoryId);
		} catch (Exception e) {
			log.error("{}-SubCategoryServiceImpl   getSubCategory()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage()); 
		}
	}

	@Override
	public void updateSubCategory(SubCategoryDTO subCategoryDTO) {
		log.info("{}-SubCategoryServiceImpl updateSubCategory() started");
		try {
			log.info("{}-SubCategoryServiceImpl updateSubCategory() getting Category details is SubCategoryClient");
			subCategoryClient.updateSubCategory(subCategoryDTO);
		} catch (Exception e) {
			log.error("{}-SubCategoryServiceImpl  updateSubCategory()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
	}

	@Override
	public void deleteSubCategory(Integer subCategoryId) {
		log.info("{}-SubCategoryServiceImpl deleteSubCategory() started");
		try {
			log.info("{}-SubCategoryServiceImpl deleteSubCategory() getting Category details is SubCategoryClient");
			subCategoryClient.deleteSubCategory(subCategoryId);
		} catch (Exception e) {
			log.error("{}-SubCategoryServiceImpl  deleteSubCategory()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
		
	}

}

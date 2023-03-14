package com.akhm.service;

import java.util.List;

import com.akhm.repository.enity.SubCategoryEntity;

public interface SubCategoryService {
	public Integer insertSubCategory(SubCategoryEntity subCategoryEntity);
	public List<SubCategoryEntity> getSubCategories();
	public SubCategoryEntity getSubCategory(Integer subCategoryId);
	public void updateSubCategory(SubCategoryEntity subCategoryEntity);
	public void deleteSubCategory(Integer categoryId);
}
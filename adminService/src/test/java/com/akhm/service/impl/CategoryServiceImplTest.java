package com.akhm.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.akhm.exception.MyCustomException;
import com.akhm.repository.CategoryRepository;
import com.akhm.repository.enity.CategoryEntity;
import com.akhm.service.CategoryService;
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryServiceImplTest {
	@Mock
	private CategoryService categoryService;
	@Mock
	private CategoryRepository categoryRepository;
	@Test
	public void insertCategoryTest() throws Exception
	{
		CategoryEntity categoryEntity=new CategoryEntity();
		CategoryEntity categoryEntity2=Mockito.any();
		Mockito.when(categoryRepository.save(categoryEntity)).thenReturn(categoryEntity2);
		Integer categoryId=categoryService.insertCategory(categoryEntity);
		assertNotNull(categoryId);
		
	}
	@Test(expected = MyCustomException.class)
	public void insertCategoryTest_Exception() throws Exception
	{
		CategoryEntity categoryEntity=new CategoryEntity();
		when(categoryRepository.save(categoryEntity)).thenThrow(NullPointerException.class);
		categoryService.insertCategory(categoryEntity);
	}
	

}

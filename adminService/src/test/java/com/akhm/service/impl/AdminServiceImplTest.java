package com.akhm.service.impl;




import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.akhm.exception.MyCustomException;
import com.akhm.repository.AdminRepository;
import com.akhm.repository.enity.AdminEntity;
import com.akhm.service.AdminService;
@RunWith(SpringJUnit4ClassRunner.class)
public class AdminServiceImplTest {
	@Mock
	private AdminService adminService;
	@Mock
	private AdminRepository adminRepository;
	@Test
	public void getAdminTest() throws Exception{

		AdminEntity adminEntity=new AdminEntity();
		Mockito.when(adminRepository.findByEmailIdAndPassword("deva", "1234")).thenReturn(adminEntity);
		AdminEntity admin=adminService.getAdmin("deva", "1234");
		Assert.assertNull(admin);  
	}
	@Test(expected = MyCustomException.class)
	public void getAdmin_ExceptionTest() throws Exception{
		
		Mockito.when(adminRepository.findByEmailIdAndPassword("deva", "1234")).thenThrow(NullPointerException.class);
		adminService.getAdmin("deva", "1234");
		
	}
}

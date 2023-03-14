package com.akhm.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.akhm.service.dto.ProductPriceDTO;


@FeignClient(value = "productPriceClient")
public interface ProductPriceClient {
	@RequestMapping(method = RequestMethod.POST,value = "/productprice/save")
	public Integer saveProductPrice(ProductPriceDTO productPriceDTO);
	@RequestMapping(method = RequestMethod.GET,value = "/productprice/get")
	public List<ProductPriceDTO> getProductPrices(Integer productId,String status);
	@RequestMapping(method = RequestMethod.POST,value = "/productprice/get/{productid}")
	public ProductPriceDTO getProductPrice(Integer productId,String status);
	@RequestMapping(method = RequestMethod.POST,value = "/productprice/update")
	public void updateProductPrice(ProductPriceDTO productPriceDTO);


}

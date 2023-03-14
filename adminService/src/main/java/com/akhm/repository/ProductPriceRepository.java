package com.akhm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.repository.enity.ProductPriceEntity;
@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPriceEntity, Integer>{
	public List<ProductPriceEntity> findAllByProductIdAndStatus(Integer productId,String status);
	public Optional<ProductPriceEntity> findByProductIdAndStatus(Integer productId,String status);

}

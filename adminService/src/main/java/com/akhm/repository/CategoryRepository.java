package com.akhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.repository.enity.CategoryEntity;
@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer >{

}

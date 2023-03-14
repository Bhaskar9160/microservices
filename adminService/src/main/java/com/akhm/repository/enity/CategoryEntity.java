package com.akhm.repository.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="CATEGO_TL")
@Getter
@Setter
public class CategoryEntity {
	@Id
	@GeneratedValue
	private Integer  CategoryId;
	private String  CategoryName;
	private String CategoryDescription;
	private String CategoryCode;
	
}

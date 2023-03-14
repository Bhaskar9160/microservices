package com.akhm.repository.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
/** 
 * <h2>AdminEntity
 * This Entity Class Map To AdminEntity
 * @author Teshadri
 * @version 1.0
 * @since 2022-02-12
 * */


@Entity
@Table(name="ADMIN_TL")
@Data
public class AdminEntity {
	//primary key
	@Id
	@GeneratedValue
	@Column(name="ADMIN_ID")
	//name of the adminId
	private Integer adminId;
	@Column(name="FIRST_NAME")
	//name of the firstName
	private String firstName;
	@Column(name="LAST_NAME")
	//name of the lastName
	private String lastName;
	@Column(name="EMAIL_ID")
	//name of the emailId
	private String emailId;
	@Column(name="PASSWORD")
	//name of the password
	private String password;
	

}

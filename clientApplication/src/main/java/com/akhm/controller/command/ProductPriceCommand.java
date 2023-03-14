
package com.akhm.controller.command;

import java.sql.Date;

import lombok.Data;
@Data
public class ProductPriceCommand {
	private Integer productPriceId;
	private Integer productId;
	private Double amount;
	private String status;
	private Date createdOn;

}

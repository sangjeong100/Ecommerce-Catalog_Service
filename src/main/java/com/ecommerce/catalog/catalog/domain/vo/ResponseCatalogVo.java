package com.ecommerce.catalog.catalog.domain.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCatalogVo {

	private String productId;
	private String productName;
	private Integer stock;
	private Integer unitPrice;
	private LocalDate createDate;
}

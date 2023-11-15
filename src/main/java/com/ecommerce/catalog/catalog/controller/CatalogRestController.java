package com.ecommerce.catalog.catalog.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.catalog.catalog.domain.jpa.entity.CatalogEntity;
import com.ecommerce.catalog.catalog.domain.vo.ResponseCatalogVo;
import com.ecommerce.catalog.catalog.service.CatalogService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CatalogRestController {

	private final Environment env;
	
	private final CatalogService catalogService;
	
	/**
	 * 서버 상태 체크
	 * 
	 * @param request
	 * @return
	 */
	@GetMapping("/health_check")
	public String status(HttpServletRequest request) {
		return String.format("It's Working in User Service on Port %s", request.getServerPort());
	}
	
	/**
	 * 전체 상품 조회
	 * 
	 * @return
	 */
	@GetMapping("/catalogs")
	public ResponseEntity<List<ResponseCatalogVo>> getCatalogList(){
		
		Iterable<CatalogEntity> catalogList = catalogService.getAllCatalogs();
		
		List<ResponseCatalogVo> resultList = new ArrayList<>();
		catalogList.forEach(catalog -> {
			resultList.add(new ModelMapper().map(catalog, ResponseCatalogVo.class));
		});
		
		return ResponseEntity.status(HttpStatus.OK).body(resultList);
		
	}
	
}

package com.ecommerce.catalog.catalog.service;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.ecommerce.catalog.catalog.domain.jpa.entity.CatalogEntity;
import com.ecommerce.catalog.catalog.domain.jpa.repo.CatalogRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {
	
	private final Environment env;
	
	private final CatalogRepo catalogRepo;
	
	/**
	 * 카탈로그 전체 조회
	 */
	@Override
	public Iterable<CatalogEntity> getAllCatalogs() {
		// TODO Auto-generated method stub
		return catalogRepo.findAll();
	}


	
}

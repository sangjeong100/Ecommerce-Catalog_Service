package com.ecommerce.catalog.catalog.domain.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.catalog.catalog.domain.jpa.entity.CatalogEntity;

public interface CatalogRepo extends JpaRepository<CatalogEntity, Long>{
	CatalogEntity findByProductId(String productId);
}

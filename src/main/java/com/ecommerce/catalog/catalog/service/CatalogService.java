package com.ecommerce.catalog.catalog.service;

import com.ecommerce.catalog.catalog.domain.jpa.entity.CatalogEntity;

public interface CatalogService {

	Iterable<CatalogEntity> getAllCatalogs();
}

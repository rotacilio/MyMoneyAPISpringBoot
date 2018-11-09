package br.com.ciadasbolsas.CiaDasBolsas.services;

import br.com.ciadasbolsas.CiaDasBolsas.domain.Brand;

import java.util.List;

public interface BrandService {
    Brand saveNewBrand(Brand brand);
    List<Brand> getAllBrands();
}

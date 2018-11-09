package br.com.ciadasbolsas.CiaDasBolsas.services.impl;

import br.com.ciadasbolsas.CiaDasBolsas.domain.Brand;
import br.com.ciadasbolsas.CiaDasBolsas.repositories.BrandRepository;
import br.com.ciadasbolsas.CiaDasBolsas.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository mBrandRepository;

    @Override
    public Brand saveNewBrand(Brand brand) {
        return mBrandRepository.save(brand);
    }

    @Override
    public List<Brand> getAllBrands() {
        return mBrandRepository.findAll(Sort.by("name"));
    }
}

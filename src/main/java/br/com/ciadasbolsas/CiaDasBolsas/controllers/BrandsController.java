package br.com.ciadasbolsas.CiaDasBolsas.controllers;

import br.com.ciadasbolsas.CiaDasBolsas.domain.Brand;
import br.com.ciadasbolsas.CiaDasBolsas.services.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "Brands controller", description = "Controlador de bandeiras dos cartões")
@RestController
@RequestMapping(value = "/brands")
public class BrandsController {

    @Autowired
    private BrandService mService;

    @ApiOperation(value = "Salvar bandeira de cartão")
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Brand saveNewBrand(
            @ApiParam(value = "Bandeira a ser salva", required = true)
            @Valid @RequestBody Brand brand) {
        return mService.saveNewBrand(brand);
    }

    @ApiOperation(value = "Listar todas as bandeiras")
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Brand> getAllBrands() {
        return mService.getAllBrands();
    }
}

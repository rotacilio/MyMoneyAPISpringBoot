package br.com.ciadasbolsas.CiaDasBolsas.controllers;

import br.com.ciadasbolsas.CiaDasBolsas.domain.Card;
import br.com.ciadasbolsas.CiaDasBolsas.services.CardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "Cards controller", description = "Controlador de cartões")
@RestController
@RequestMapping(value = "/cards")
public class CardsController {

    @Autowired
    private CardService mCardService;

    @ApiOperation(value = "Criar novo cartão")
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Card createNewCard(
            @ApiParam(value = "Cartão a ser criado", required = true)
            @Valid @RequestBody Card card) {
        return mCardService.saveNewCard(card);
    }

    @ApiOperation(value = "Listar todos os cartões")
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Card> findAll() {
        return mCardService.findAll();
    }

    @ApiOperation(value = "Atualizar cartão")
    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT)
    public Card updateCard(
            @ApiParam(value = "Cartão a ser atualizado", required = true)
            @RequestBody Card card) {
        return mCardService.updateCard(card);
    }
}

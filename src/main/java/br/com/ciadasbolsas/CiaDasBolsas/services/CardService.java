package br.com.ciadasbolsas.CiaDasBolsas.services;

import br.com.ciadasbolsas.CiaDasBolsas.domain.Card;

import java.util.List;

public interface CardService {
    Card saveNewCard(Card card);
    List<Card> findAll();
    Card updateCard(Card card);
}

package br.com.ciadasbolsas.CiaDasBolsas.services.impl;

import br.com.ciadasbolsas.CiaDasBolsas.domain.Card;
import br.com.ciadasbolsas.CiaDasBolsas.repositories.CardRepository;
import br.com.ciadasbolsas.CiaDasBolsas.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("cardService")
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository mCardRepository;

    @Override
    public Card saveNewCard(Card card) {
        card.setCreatedAt(new Date());
        card.setEnabled(true);
        return mCardRepository.save(card);
    }

    @Override
    public List<Card> findAll() {
        return mCardRepository.findAll(Sort.by("id"));
    }

    @Override
    public Card updateCard(Card card) {
        Card oldCard = mCardRepository.getOne(card.getId());
        oldCard.setEnabled((card.getEnabled() != null && oldCard.getEnabled() != card.getEnabled()) ? card.getEnabled() : oldCard.getEnabled());
        oldCard.setBrand((card.getBrand() != null && oldCard.getBrand() != card.getBrand()) ? card.getBrand() : oldCard.getBrand());
        oldCard.setExpirateDay((card.getExpirateDay() != null && oldCard.getExpirateDay() != card.getExpirateDay()) ? card.getExpirateDay() : oldCard.getExpirateDay());
        oldCard.setName((card.getName() != null && oldCard.getName() != card.getName()) ? card.getName() : oldCard.getName());
        oldCard.setUpdatedAt(new Date());
        return mCardRepository.save(oldCard);
    }

    private void verifyDuplicatedName(String cardName) {

    }
}

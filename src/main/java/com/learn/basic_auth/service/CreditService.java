package com.learn.basic_auth.service;

import com.learn.basic_auth.entity.Account;
import com.learn.basic_auth.entity.ArrangementDetail;
import com.learn.basic_auth.entity.CreditCard;
import com.learn.basic_auth.mapper.CreditMapper;
import com.learn.basic_auth.model.CreditCardDto;
import com.learn.basic_auth.repo.AccountRepo;
import com.learn.basic_auth.repo.ArrangementDetailRepo;
import com.learn.basic_auth.repo.CreditCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditService {
    @Autowired
    CreditCardRepo creditCardRepo;
    @Autowired
    CreditMapper creditMapper;

    @Autowired
    AccountRepo accountRepo;
    @Autowired
    ArrangementDetailRepo arrangementDetailRepo;

    public CreditCard addCard(CreditCardDto creditCardDto,Long arrangementId,Long accountId)
    {
        CreditCard creditCard = creditMapper.convertCreditCardDtoToCreditCardEntity(creditCardDto);
        Account account = accountRepo.findById(accountId).get();
        ArrangementDetail arrangementDetail = arrangementDetailRepo.findById(arrangementId).get();
        creditCard.setAccount(account);
        creditCard.setArrangementDetail(arrangementDetail);
        return this.creditCardRepo.save(creditCard);
    }









}

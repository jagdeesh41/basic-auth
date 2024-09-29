package com.learn.basic_auth.service;

import com.learn.basic_auth.entity.Account;
import com.learn.basic_auth.entity.Saving;
import com.learn.basic_auth.mapper.SavingsMapper;
import com.learn.basic_auth.model.SavingDto;
import com.learn.basic_auth.repo.AccountRepo;
import com.learn.basic_auth.repo.SavingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingService {
    @Autowired
    SavingsRepo savingsRepo;
    @Autowired
    SavingsMapper savingsMapper;
    @Autowired
    AccountRepo accountRepo;
    public void addSavingsAccount(SavingDto savingDto, Long accountId) {
        Saving saving = savingsMapper.convertSavingDtoToEntity(savingDto);
        Account account = accountRepo.findById(accountId).get();
        saving.setAccount(account);
        savingsRepo.save(saving);
    }
}

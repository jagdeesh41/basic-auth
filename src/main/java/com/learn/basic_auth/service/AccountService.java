package com.learn.basic_auth.service;

import com.learn.basic_auth.entity.Account;
import com.learn.basic_auth.mapper.AccountsMapper;
import com.learn.basic_auth.model.AccountDto;
import com.learn.basic_auth.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepo accountRepo;
    @Autowired
    AccountsMapper accountsMapper;
    public void postAccount(AccountDto accountDto)
    {
        accountRepo.save(accountsMapper.convertAccountDtoToEntity(accountDto));

    }
    public List<AccountDto> getAccounts() {
        List<Account> accounts = accountRepo.findAll();
        return accounts.stream().map(account-> accountsMapper.convertAccountEntityToDto(account)).toList();
    }
}

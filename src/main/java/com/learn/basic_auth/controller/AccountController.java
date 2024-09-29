package com.learn.basic_auth.controller;

import com.learn.basic_auth.model.AccountDto;
import com.learn.basic_auth.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/account")
    public ResponseEntity<Void> postAccount(@RequestBody AccountDto accountDto) {
        accountService.postAccount(accountDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/account")
    public ResponseEntity<List<AccountDto>> getAccounts() {
        return ResponseEntity.ok().body(accountService.getAccounts());
    }


}

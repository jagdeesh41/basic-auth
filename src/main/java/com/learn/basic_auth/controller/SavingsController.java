package com.learn.basic_auth.controller;

import com.learn.basic_auth.model.SavingDto;
import com.learn.basic_auth.service.SavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SavingsController {
    @Autowired
    SavingService savingService;

    @PostMapping("/savings")
    public ResponseEntity<Void> addSavingsAccount(@RequestBody SavingDto savingDto,
                                                  @RequestParam("account_id") Long accountId)
    {
        savingService.addSavingsAccount(savingDto,accountId);
        return ResponseEntity.ok().build();
    }

}

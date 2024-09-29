package com.learn.basic_auth.controller;

import com.learn.basic_auth.model.CreditCardDto;
import com.learn.basic_auth.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CreditCardController {
    @Autowired
    CreditService creditService;
    @PostMapping("/card")
    public ResponseEntity<Void> addCard(@RequestBody CreditCardDto creditCardDto,
                                        @RequestParam("arrangement_id") Long arrangementId,
                                        @RequestParam("account_id") Long accountId)
    {
        this.creditService.addCard(creditCardDto,arrangementId,accountId);
        return ResponseEntity.ok().build();
    }



}

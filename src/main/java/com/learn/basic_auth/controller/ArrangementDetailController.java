package com.learn.basic_auth.controller;

import com.learn.basic_auth.model.ArrangementDetailDto;
import com.learn.basic_auth.service.ArrangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArrangementDetailController {
    @Autowired
    ArrangementService arrangementService;
    @PostMapping("/prd")
    public ResponseEntity<Void> addCard(@RequestBody ArrangementDetailDto arrangementDetailDto)
    {
        arrangementService.addCard(arrangementDetailDto);
        return ResponseEntity.ok().build();

    }

}

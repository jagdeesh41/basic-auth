package com.learn.basic_auth.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SavingDto {
    private Long id;
    //one saving account with one account
    private int cardNumber;
    private String cardName;
    private int cardAccountNumber;
    private int accountBalance;
}

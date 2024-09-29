package com.learn.basic_auth.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private int id;
    private String accountUserName;
    private List<CreditCardDto> creditCards;
    private List<SavingDto> savings;
}

package com.learn.basic_auth.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardDto {
    private Long id;
    private String cardNumber;
    private String cardName;
    private int cardAccountNumber;
}

package com.learn.basic_auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "C")
public class Saving {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //one saving account with one account
    private int cardNumber;
    private String cardName;
    private int cardAccountNumber;
    private int accountBalance;
    //many saving accounts associated with one account
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
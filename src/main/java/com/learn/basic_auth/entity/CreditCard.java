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
@Table(name = "CC")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //one credit card is associated with one account
    private String cardNumber;
    private String cardName;
    private int cardAccountNumber;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "arrangement_detail_id")
    private ArrangementDetail arrangementDetail;

    //Many credit cards belong to one account
    @ManyToOne
    //column name to store id of corresponding account
    @JoinColumn(name = "account_id")
    private Account account;
}
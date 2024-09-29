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
@Table(name = "arrangement-detail")
public class ArrangementDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //one arrangementDetail is associated with one credit card
    private String name;
    private int cardBalance;
    private int cardLimit;
    private int maxTransferLimit;
    //one to one mapping onto creditCard
    @OneToOne(mappedBy = "arrangementDetail", fetch = FetchType.LAZY)
    private CreditCard creditCard;
}
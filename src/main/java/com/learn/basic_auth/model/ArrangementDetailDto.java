package com.learn.basic_auth.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArrangementDetailDto {
    private Long id;
    private String name;
    private int cardBalance;
    private int cardLimit;
    private int maxTransferLimit;
}

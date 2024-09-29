package com.learn.basic_auth.mapper;

import com.learn.basic_auth.entity.CreditCard;
import com.learn.basic_auth.model.CreditCardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreditMapper {
    CreditCard convertCreditCardDtoToCreditCardEntity(CreditCardDto creditCardDto);
    CreditCardDto convertCreditCardEntityToCreditCardDto(CreditCard creditCard);
}

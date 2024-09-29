package com.learn.basic_auth.mapper;

import com.learn.basic_auth.entity.Account;
import com.learn.basic_auth.model.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountsMapper {
    public  Account convertAccountDtoToEntity(AccountDto accountDto);
    public AccountDto convertAccountEntityToDto(Account account);
}

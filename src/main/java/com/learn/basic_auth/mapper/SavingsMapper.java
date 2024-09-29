package com.learn.basic_auth.mapper;

import com.learn.basic_auth.entity.Saving;
import com.learn.basic_auth.model.SavingDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SavingsMapper {
    public Saving convertSavingDtoToEntity(SavingDto savingDto);
    public SavingDto convertSavingEntityToDto(Saving saving);
}
package com.learn.basic_auth.mapper;

import com.learn.basic_auth.entity.ArrangementDetail;
import com.learn.basic_auth.model.ArrangementDetailDto;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface ArrangementMapper {
    public ArrangementDetail convertArrangementDetailDtoToEntity(ArrangementDetailDto arrangementDetailDto);
    public ArrangementDetailDto convertArrangementEntityToDto(ArrangementDetail arrangementDetail);

}

package com.learn.basic_auth.service;

import com.learn.basic_auth.entity.ArrangementDetail;
import com.learn.basic_auth.mapper.ArrangementMapper;
import com.learn.basic_auth.model.ArrangementDetailDto;
import com.learn.basic_auth.repo.ArrangementDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArrangementService {
    @Autowired
    ArrangementDetailRepo arrangementDetailRepo;
    @Autowired
    ArrangementMapper arrangementMapper;
    public void addCard(ArrangementDetailDto arrangementDetailDto)
    {
        ArrangementDetail arrangementDetail = arrangementMapper.convertArrangementDetailDtoToEntity(arrangementDetailDto);
        this.arrangementDetailRepo.save(arrangementDetail);

    }

}

package com.learn.basic_auth.repo;

import com.learn.basic_auth.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditCardRepo extends JpaRepository<CreditCard,Long> {
    List<CreditCard> findAllByAccountId(int accountId);

//    CreditCard findByArrangementDetail(int arrangementId);
}

package com.learn.basic_auth.repo;

import com.learn.basic_auth.entity.Account;
import com.learn.basic_auth.entity.Saving;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SavingsRepo extends JpaRepository<Saving,Long> {
    List<Account> findByAccountId(int accountId);
}

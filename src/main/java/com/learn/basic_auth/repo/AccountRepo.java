package com.learn.basic_auth.repo;

import com.learn.basic_auth.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,Long> {
}

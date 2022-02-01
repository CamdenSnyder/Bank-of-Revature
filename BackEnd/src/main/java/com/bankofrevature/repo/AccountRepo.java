package com.bankofrevature.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankofrevature.dao.Account;

public interface AccountRepo extends JpaRepository<Account,Integer>
{

}

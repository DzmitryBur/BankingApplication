package com.cot.bankingapplication.repository;

import com.cot.bankingapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
//    void transferMoneyFromFirstToSecondIban(String ibanFirst, String ibanSecond, long summ);
}

package com.example.financebackend.respository;

import com.example.financebackend.entity.AccountRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRecordRepository extends JpaRepository<AccountRecord, Integer> {
}

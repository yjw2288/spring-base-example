package com.yjw2288.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BoardAccountRepository
        extends JpaRepository<BoardAccount, Long>,
        QuerydslPredicateExecutor<BoardAccount> {
}

package com.yjw2288.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardAccountService {

    @Autowired
    private BoardAccountRepository boardAccountRepository;

    @Transactional(readOnly = false)
    public List<BoardAccount> boardsOnWrite() {
        return boardAccountRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<BoardAccount> boardsOnRead() {
        return boardAccountRepository.findAll();
    }
}

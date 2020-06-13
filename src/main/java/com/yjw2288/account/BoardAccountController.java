package com.yjw2288.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class BoardAccountController {
    @Autowired
    private BoardAccountService boardAccountService;

    @GetMapping("onWrite")
    public List<BoardAccount> accountList() {
        return boardAccountService.boardsOnWrite();
    }

    @GetMapping("onRead")
    public List<BoardAccount> accountOnRead(){
        return boardAccountService.boardsOnRead();
    }
}

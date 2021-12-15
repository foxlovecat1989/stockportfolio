package com.moresby.ed.stockportfolio.resource;

import com.moresby.ed.stockportfolio.service.AccountService;
import com.moresby.ed.stockportfolio.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping(path = "/{userId}")
    public Account findAccountByUserId(@PathVariable("userId") Long userId){
        return accountService.findExistingAccountByUserId(userId);
    }
}
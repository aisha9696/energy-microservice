package com.docker.example.accountservice.controller;

import com.docker.example.accountservice.model.AccountModel;
import com.docker.example.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Aisha on 14.03.2018.
 */

@RestController
@RequestMapping("/rest/account")
@CrossOrigin({"http://localhost:8080","http://localhost:8301","http://localhost:8085","http://localhost:8301","http://localhost:8086"})
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/hello")
    public  String sayHello(){
        return "hello Aisha";
    }

    @GetMapping("/accountmodel/{cityName}")
    public AccountModel getAccountConsumption(@PathVariable("cityName") final String cityName){

        return accountRepository.generateAccount(cityName);
    }
}

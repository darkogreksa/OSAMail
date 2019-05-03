package uns.ac.rs.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uns.ac.rs.Mail.dto.AccountDTO;
import uns.ac.rs.Mail.entity.Account;
import uns.ac.rs.Mail.service.impl.AccountService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="api/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value="/all")
    public ResponseEntity<List<AccountDTO>> getAccounts(){
        List<Account> accounts = accountService.findAll();
        List<AccountDTO> accountDTO = new ArrayList<AccountDTO>();
        for (Account a : accounts) {
            accountDTO.add(new AccountDTO(a));
        }
        return new ResponseEntity<List<AccountDTO>>(accountDTO, HttpStatus.OK);
    }

    @GetMapping(value="/all/{id}")
    public ResponseEntity<AccountDTO> getUser(@PathVariable("id") Integer id){
        Account account = accountService.findOne(id);
        if(account != null) {
            return new ResponseEntity<AccountDTO>(new AccountDTO(account), HttpStatus.OK);
        }
        return new ResponseEntity<AccountDTO>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value="{username}/{password}")
    public ResponseEntity<AccountDTO> login(@PathVariable("username") String username, @PathVariable("password") String password){
        Account account = accountService.findByUsernameAndPassword(username, password);
        System.out.println("NESTOOOOOOOOOOOOOOOOOOOOOOO " + account.toString());
        if(account != null) {
            System.out.println("AAAAAAAAAAAAAAAAA " + account.toString());
            return new ResponseEntity<AccountDTO>(new AccountDTO(account), HttpStatus.OK);

        }
        return new ResponseEntity<AccountDTO>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value="{username}")
    public ResponseEntity<AccountDTO> findByUsername(@PathVariable("username") String username){
        Account account = accountService.findByUsername(username);
        if(account != null) {
            return new ResponseEntity<AccountDTO>(new AccountDTO(account), HttpStatus.OK);

        }
        return new ResponseEntity<AccountDTO>(HttpStatus.NOT_FOUND);
    }

}
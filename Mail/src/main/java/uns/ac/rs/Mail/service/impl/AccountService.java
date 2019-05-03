package uns.ac.rs.Mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uns.ac.rs.Mail.entity.Account;
import uns.ac.rs.Mail.repository.AccountRepository;
import uns.ac.rs.Mail.service.AccountServiceInterface;

import java.util.List;

@Service
public class AccountService implements AccountServiceInterface {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account findOne(Integer accId) {
        return accountRepository.findById(accId).get();
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findByUsernameAndPassword(String username, String password) {
        Account account = accountRepository.findByUsername(username);
        if(account.getUsername().equals(username) && account.getPassword().equals(password))
            return account;
        else
            return null;
    }

    @Override
    public Account findByUsername(String username) {
        Account account = accountRepository.findByUsername(username);
        if(account.getUsername().equals(username))
            return account;
        else
            return null;
    }
}

package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Account;

import java.util.List;

public interface AccountServiceInterface {

    Account findOne(Integer accId);
    List<Account> findAll();
    Account findByUsernameAndPassword(String username, String password);
    Account findByUsername(String username);

}

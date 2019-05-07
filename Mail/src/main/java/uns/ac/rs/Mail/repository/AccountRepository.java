package uns.ac.rs.Mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uns.ac.rs.Mail.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUsername(String username);
}

package uns.ac.rs.Mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uns.ac.rs.Mail.entity.Account;
import uns.ac.rs.Mail.entity.Folder;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Integer> {
    List<Folder> findByAccount(Account account);
}
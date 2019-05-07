package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Account;
import uns.ac.rs.Mail.entity.Folder;

import java.util.List;

public interface FolderServiceInterface {

    Folder findOne(Integer folderId);
    List<Folder> findAll();
    List<Folder> findByAccount(Account account);

}

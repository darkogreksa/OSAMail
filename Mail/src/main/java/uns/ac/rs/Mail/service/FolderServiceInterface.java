package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Account;
import uns.ac.rs.Mail.entity.Folder;

import java.util.List;

public interface FolderServiceInterface {

    Folder findOne(Long folderId);
    List<Folder> findAll();
//    List<Folder> findByAccount(Account account);
    Folder save(Folder folder);
    void remove(Long folderId);

}

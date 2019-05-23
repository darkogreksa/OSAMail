package uns.ac.rs.Mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uns.ac.rs.Mail.entity.Account;
import uns.ac.rs.Mail.entity.Folder;
import uns.ac.rs.Mail.repository.FolderRepository;
import uns.ac.rs.Mail.service.FolderServiceInterface;

import java.util.List;

@Service
public class FolderService implements FolderServiceInterface {

    @Autowired
    FolderRepository folderRepository;

    @Override
    public Folder findOne(Long folderId) {
        return folderRepository.findById(folderId).get();
    }

    @Override
    public List<Folder> findAll() {
        return folderRepository.findAll();
    }

//    @Override
//    public List<Folder> findByAccount(Account account) {
//        return folderRepository.findByAccount(account);
//    }

    @Override
    public Folder save(Folder folder) {
        return folderRepository.save(folder);
    }

    @Override
    public void remove(Long folderId) {
        folderRepository.deleteById(folderId);
    }
}
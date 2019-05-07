package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Folder;
import uns.ac.rs.Mail.entity.Rule;

import java.io.Serializable;

public class FolderDTO implements Serializable {
    private Long id;
    private String name;
    private Rule destination;
    private Folder parentFolder;
    private AccountDTO account;

    public FolderDTO() {
    }

    public FolderDTO(Long id, String name, Rule destination, Folder parentFolder, AccountDTO account) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.parentFolder = parentFolder;
        this.account = account;
    }

    public FolderDTO(Folder folder) {
        this(folder.getId(), folder.getName(), folder.getDestination(), folder.getParentFolder(), new AccountDTO(folder.getAccount()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rule getDestination() {
        return destination;
    }

    public void setDestination(Rule destination) {
        this.destination = destination;
    }

    public Folder getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(Folder parentFolder) {
        this.parentFolder = parentFolder;
    }

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }
}

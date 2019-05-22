package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Folder;
import uns.ac.rs.Mail.entity.Rule;

import java.io.Serializable;

public class FolderDTO implements Serializable {
    private Long id;
    private String name;
    private String destination;
    private Double parentFolder;
//    private AccountDTO account;

    public FolderDTO() {
    }

    public FolderDTO(Long id, String name, String destination, Double parentFolder) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.parentFolder = parentFolder;
    }

    public FolderDTO(Folder folder) {
        this(folder.getId(), folder.getName(), folder.getDestination(), folder.getParentFolder());
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

   public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(Double parentFolder) {
        this.parentFolder = parentFolder;
    }

//    public AccountDTO getAccount() {
//        return account;
//    }
//
//    public void setAccount(AccountDTO account) {
//        this.account = account;
//    }
}

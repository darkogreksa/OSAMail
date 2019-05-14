package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "folder")
public class Folder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "folder_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", unique = false, nullable = false)
    private String name;

    @Column(name = "destination", unique = false, nullable = false)
    private Rule destination;

    @Column(name = "parent_folder", unique = false, nullable = false)
    private Double parentFolder;

//    @ManyToOne
//    @JoinColumn(name="account_id", referencedColumnName="account_id", nullable=false)
//    private Account account;

//    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "folder")
//    private Set<Message> folderMessage = new HashSet<Message>();

    public Folder() {
    }

    public Folder(Long id, String name, Rule destination, Double parentFolder) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.parentFolder = parentFolder;
//        this.account = account;
//        this.folderMessage = folderMessage;
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

    public Double getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(Double parentFolder) {
        this.parentFolder = parentFolder;
    }

//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }

//    public Set<Message> getFolderMessage() {
//        return folderMessage;
//    }
//
//    public void setFolderMessage(Set<Message> folderMessage) {
//        this.folderMessage = folderMessage;
//    }

    @Override
    public String toString() {
        return "Folder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", destination=" + destination +
//                ", parentFolder=" + parentFolder +
//                ", account=" + account +
//                ", folderMessage=" + folderMessage +
                '}';
    }
}

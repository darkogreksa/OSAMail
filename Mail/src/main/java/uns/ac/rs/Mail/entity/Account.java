package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "smtp_address", unique = false, nullable = false)
    private String smtpAddress;

    @Column(name = "smtp_port", unique = false, nullable = false)
    private Integer smtpPort;

    @Column(name = "in_server_type", unique = false, nullable = false)
    private Integer inServerType;

    @Column(name = "in_server_address", unique = false, nullable = false)
    private String inServerAddress;

    @Column(name = "in_server_port", unique = false, nullable = false)
    private Integer inServerPort;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", unique = false, nullable = false)
    private String password;

    @Column(name = "display_name", unique = false, nullable = false)
    private String displayName;

    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "message")
    private Set<Message> accountMessage = new HashSet<Message>();

    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "folder")
    private Set<Folder> accountFolder = new HashSet<Folder>();

    public Account(Long id, String smtpAddress, Integer smtpPort, Integer inServerType, String inServerAddress, Integer inServerPort, String username, String password, String displayName, Set<Message> accountMessage, Set<Folder> accountFolder) {
        this.id = id;
        this.smtpAddress = smtpAddress;
        this.smtpPort = smtpPort;
        this.inServerType = inServerType;
        this.inServerAddress = inServerAddress;
        this.inServerPort = inServerPort;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.accountMessage = accountMessage;
        this.accountFolder = accountFolder;
    }

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSmtpAddress() {
        return smtpAddress;
    }

    public void setSmtpAddress(String smtpAddress) {
        this.smtpAddress = smtpAddress;
    }

    public Integer getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    public Integer getInServerType() {
        return inServerType;
    }

    public void setInServerType(Integer inServerType) {
        this.inServerType = inServerType;
    }

    public String getInServerAddress() {
        return inServerAddress;
    }

    public void setInServerAddress(String inServerAddress) {
        this.inServerAddress = inServerAddress;
    }

    public Integer getInServerPort() {
        return inServerPort;
    }

    public void setInServerPort(Integer inServerPort) {
        this.inServerPort = inServerPort;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Set<Message> getAccountMessage() {
        return accountMessage;
    }

    public void setAccountMessage(Set<Message> accountMessage) {
        this.accountMessage = accountMessage;
    }

    public Set<Folder> getAccountFolder() {
        return accountFolder;
    }

    public void setAccountFolder(Set<Folder> accountFolder) {
        this.accountFolder = accountFolder;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", smtpAddress='" + smtpAddress + '\'' +
                ", smtpPort=" + smtpPort +
                ", inServerType=" + inServerType +
                ", inServerAddress='" + inServerAddress + '\'' +
                ", inServerPort=" + inServerPort +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", displayName='" + displayName + '\'' +
                ", accountMessage=" + accountMessage +
                ", accountFolder=" + accountFolder +
                '}';
    }
}

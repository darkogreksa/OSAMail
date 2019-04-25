package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", unique = false, nullable = false)
    private String password;

    @Column(name = "smtp", unique = false, nullable = false)
    private String smtp;

    @Column(name = "pop3", unique = false, nullable = false)
    private String pop3;

    @Column(name = "email", unique = false, nullable = false)
    private String email;

    public Account(Integer id, String username, String password, String smtp, String pop3, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.smtp = smtp;
        this.pop3 = pop3;
        this.email = email;
    }

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getPop3() {
        return pop3;
    }

    public void setPop3(String pop3) {
        this.pop3 = pop3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", smtp='" + smtp + '\'' +
                ", pop3='" + pop3 + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

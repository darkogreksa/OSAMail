package uns.ac.rs.Mail.dto;

import java.io.Serializable;

public class AccountDTO implements Serializable {
    private int id;
    private String username;
    private String password;
    private String smtp;
    private String pop3;
    private String email;

    public AccountDTO() {
    }

    public AccountDTO(int id, String username, String password, String smtp, String pop3, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.smtp = smtp;
        this.pop3 = pop3;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}

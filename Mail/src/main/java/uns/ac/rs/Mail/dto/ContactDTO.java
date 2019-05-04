package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Contact;
import uns.ac.rs.Mail.entity.Photo;

import java.io.Serializable;

public class ContactDTO implements Serializable {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String display;
    private String note;

    public ContactDTO() {
    }

    public ContactDTO(Long id, String firstname, String lastname, String email, String display, String note) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.display = display;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

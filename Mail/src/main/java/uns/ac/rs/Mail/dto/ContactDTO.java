package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Contact;
import uns.ac.rs.Mail.entity.Photo;

import java.io.Serializable;

public class ContactDTO implements Serializable {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String display;
    private Contact.Format format;
    private Photo photo;

    public ContactDTO() {
    }

    public ContactDTO(int id, String firstname, String lastname, String email, String display, Contact.Format format, Photo photo) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.display = display;
        this.format = format;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Contact.Format getFormat() {
        return format;
    }

    public void setFormat(Contact.Format format) {
        this.format = format;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}

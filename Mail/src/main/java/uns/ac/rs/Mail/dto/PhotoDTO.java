package uns.ac.rs.Mail.dto;

import java.io.Serializable;

public class PhotoDTO implements Serializable {

    private Long id;
    private String path;
    private ContactDTO contact;

    public PhotoDTO() {
    }

    public PhotoDTO(Long id, String path, ContactDTO contact) {
        this.id = id;
        this.path = path;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }
}

package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "contact")
public class Contact implements Serializable {

//    public enum Format{
//        PLAIN,
//        HTML
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "first_name", unique = false, nullable = false)
    private String firstName;

    @Column(name = "last_name", unique = false, nullable = false)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "display", unique = false, nullable = false)
    private String display;

    @Column(name = "note", unique = false, nullable = false)
    private String note;

//    @Column(name = "format", unique = false, nullable = false)
//    private Format format;

    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "contact")
    private Set<Photo> contactPhoto = new HashSet<Photo>();

    public Contact(Long id, String firstName, String lastName, String email, String display, String note) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.display = display;
    }

    public Contact(Long id, String firstName, String lastName, String email, String display, String note, Set<Photo> contactPhoto) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.display = display;
        this.note = note;
        this.contactPhoto = contactPhoto;
    }

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Set<Photo> getContactPhoto() {
        return contactPhoto;
    }

    public void setContactPhoto(Set<Photo> contactPhoto) {
        this.contactPhoto = contactPhoto;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", display='" + display + '\'' +
                ", note='" + note + '\'' +
                ", contactPhoto=" + contactPhoto +
                '}';
    }
}

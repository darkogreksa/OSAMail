package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "photo")
public class Photo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "path", unique = false, nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn(name="contact_id", referencedColumnName="contact_id", nullable=false)
    private Contact contact;

    public Photo() {
    }

    public Photo(Long id, String path, Contact contact) {
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", contact=" + contact +
                '}';
    }
}
